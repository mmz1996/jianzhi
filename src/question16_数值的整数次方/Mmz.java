package question16_数值的整数次方;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 1:34
 * @Created by mmz
 */
public class Mmz {
    static double Core(double base,int exponent){
        if(base == 0.0){
            return 0.0;
        }
        if(exponent == 0){
            return 1.0;
        }else if(exponent > 0){
            return getNum(base,exponent);
        }else{
            return 1/getNum(base,exponent);
        }
    }
    static double getNum(double base,int exponent){
        double result = 0.0;
        while(exponent != 0){
            result *=base;
            exponent--;
        }
        return result;
    }
}
