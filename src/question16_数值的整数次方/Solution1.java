package question16_数值的整数次方;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/3/31 22:09
 * @Created by mmz
 */
public class Solution1 {

    static double mathmi(double base ,int exponent){
        if(base == 0.0){
            return 0;
        }
        if(exponent == 0){
            return 1;
        }else if(exponent<0){
            return 1/getmi(base,-exponent);
        }else{
            return getmi(base,exponent);
        }
    }
    static double getmi(double base,int exponent){
        double result = base;
        if(exponent == 1){
            return result;
        }
        for(int i = 2;i<=exponent;++i){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(mathmi(2, 1));
//        System.out.println(mathmi(2, 0));
//        System.out.println(mathmi(2, -1));
        System.out.println(mathmi(2, 3));
    }
}
