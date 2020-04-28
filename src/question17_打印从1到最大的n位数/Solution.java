package question17_打印从1到最大的n位数;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/9 14:48
 * @Created by mmz
 */
public class Solution {
    //初始化
    public static void solution1(int n){
        //判断边界
        if(n<=0){
            throw new RuntimeException("n必须大于等于1");
        }
        char[] number = new char[n+1];
        for(int i = 0;i<n+1;++i){
            number[i] = '0';
        }
        while(!increment(number)){
            pirntNumber(number);
        }
    }

    public static boolean increment(char[] number){
        int jinweiflag = 0;
        for(int i = number.length-1;i>0;i--){
            //如果是个位要加1
            int nSum = number[i] - '0' + jinweiflag;
            if(i == number.length-1){
                nSum++;
            }
            if(nSum >=10){
                if(i == 1){
                    number[0] = '1';
                }else{
                    jinweiflag = 1;
                    number[i] = (char)(nSum-10+48);
                }
            }else{
                jinweiflag = 0;
                number[i] = (char)(nSum+48);
            }
        }
        return number[0] == '1';
    }


    //打印数组
    public static void pirntNumber(char[] number){
        //判断一开始是不是0
        boolean flag = true;
        for(int i =0 ;i<number.length;i++){
            if(flag && number[i] !='0'){
                flag = false;
            }
            if(!flag && i==number.length-1){
                System.out.println(number[i]);
                break;
            }
            if(!flag)
                System.out.print(number[i]);
        }
    }

    public static void main(String[] args) {
        solution1(3);
    }
}