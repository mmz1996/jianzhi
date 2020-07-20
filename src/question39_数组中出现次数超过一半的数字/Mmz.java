package question39_数组中出现次数超过一半的数字;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/20 21:56
 * @Created by mmz
 */
public class Mmz {
    static int Core(int[] num){
        if(num == null || num.length<=0){
            return -1;
        }
        int temp = num[0];
        int count = 1;
        for(int i = 1;i<num.length;++i){
            if(count == 0){
                count = 1;
                temp = num[i];
            }else if (num[i] == temp){
                count++;
            }else{
                count--;
            }
        }
        int counts = 0;
        for(int i = 0 ;i<num.length;++i){
            if(num[i] == temp){
                counts++;
            }
        }
        if(counts*2 >num.length){
            return temp;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(Core(new int[]{1,  3,6, 2,6, 2, 2, 5,6,6}));
    }
}
