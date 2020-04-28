package question17_打印从1到最大的n位数;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 18:43
 * @Created by mmz
 */
public class Main {

    static void Core(int n){
        char[] number = new char[n+1];
        for(int i = 0 ; i <=n ;++i){
            number[i] = '0';
        }
        while(!CoreAdd(number)){
            CorePrint(number);
        }
    }
    static boolean CoreAdd(char[] number){
        int flag = 0;
        for(int i = number.length-1;i>=0;--i){

            int sum = 0;
            sum = flag+number[i]-'0';
            if(i == number.length-1){
                sum++;
            }
            if(sum>=10){
                if(i == 1){
                    number[0] ='1';
                    break;
                }
                flag =1;
                number[i] = (char)(sum-10+48);
            }else{
                flag = 0;
                number[i] = (char)(sum+48);
            }
        }
        return number[0] == '1';
    }

    static void CorePrint(char[] number){
        boolean flag = true;
        for(int i = 0;i<number.length;++i){
            if(flag && number[i] != '0'){
                flag =false;
            }
            if(!flag && i == number.length-1){
                System.out.println(number[i]);
                break;
            }
            if(!flag){
                System.out.print(number[i]);
            }
        }
    }

    public static void main(String[] args) {
        Core(3);
    }
}
