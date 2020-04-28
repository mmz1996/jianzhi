package question10_斐波那契数列;

/**
 * @Classname Solution3
 * @Description TODO
 * @Date 2020/3/31 17:08
 * @Created by mmz
 */
public class Solution3 {
    static int getN(int number){
        int a = 0;
        int b =1;
        int result = 0;
        if(number <=0){
            return a;
        }
        if(number==1){
            return b;
        }

        for(int i = 2;i<=number;++i){
            result = a+b;
            a = b;
            b= result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getN(6));
    }
}
