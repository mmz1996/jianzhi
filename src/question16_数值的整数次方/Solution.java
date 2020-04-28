package question16_数值的整数次方;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/9 13:59
 * @Created by mmz
 */
public class Solution {
    public static double Power(double base,int exponent){
        if(base == 0.0){
            return 0.0;
        }
        if(exponent == 0){
            return 1;
        }else if(exponent <0){
            return 1/getPower(base,-exponent);
        }else{
            return getPower(base,exponent);
        }
    }

    public static double getPower(double base,int exponent){
        double result = 1.0;
        for(int i =1;i<=exponent;++i){
            result *=base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Solution.Power(2, 1));
        System.out.println(Solution.Power(2, 0));
        System.out.println(Solution.Power(2, -1));
    }
}
