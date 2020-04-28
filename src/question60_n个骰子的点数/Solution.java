package question60_n个骰子的点数;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/30 16:32
 * @Created by mmz
 */
public class Solution {
    static int g_maxValue = 6;
    static void printAllNumber(int number){
        //边界判断
        if(number < 1){
            return;
        }
        //声明一个长度为2的二维数组
        int[][] probabilty =new int[2][];
        //第一次把第一个骰子的可能性放在第一个数组中
        probabilty[0] = new int[g_maxValue*number +1];
        //第二次把第二个骰子的可能性放在第二个数组中
        probabilty[1] = new int[g_maxValue*number +1];
        for (int i = 0;i<g_maxValue*number+1;++i){
            probabilty[0][i] = 0;
            probabilty[1][i] = 0;
        }
        int flag = 0;
        for(int i = 1;i<=g_maxValue;++i){
            probabilty[flag][i] = 1;
        }

        for(int k = 2;k<number;++k){
            for(int i = 0;i<k;++i){
                 probabilty[1-flag][i] = 0;
            }
            for(int i = k;i<=g_maxValue*k;++i){
                probabilty[1-flag][i] = 0;
                for(int j=1;j<=i&&j<=g_maxValue;++j){
                    probabilty[1-flag][i] += probabilty[flag][i-j];
                }
            }
            flag = 1- flag;
        }
        double maxValue = Double.valueOf(g_maxValue);
        double total = Math.pow(maxValue,number);
        for(int i = 0;i<g_maxValue*number;++i){
            double ration = (double)probabilty[flag][i]/total;
            System.out.println(ration);
        }
    }

    public static void main(String[] args) {
        printAllNumber(3);
    }
}
