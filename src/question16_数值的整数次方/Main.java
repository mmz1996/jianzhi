package question16_数值的整数次方;

import java.util.Base64;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 17:30
 * @Created by mmz
 */
public class Main {
    static double Core(double base,int exponent){
        if(base == 0.0){
            return 0.0;
        }
        if(exponent == 0){
            return 1.0;
        }else if(exponent >0){
            return getPower(base,exponent);
        }else{
            return 1/getPower(base,-exponent);
        }
    }

    static double getPower(double base,int exponent){
        int result = 1;
        while(exponent != 0){
            result *= base;
            exponent--;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Core(2, 1));
        System.out.println(Core(2, 0));
        System.out.println(Core(2, -1));
    }
}
