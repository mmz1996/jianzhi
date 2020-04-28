package question44_数字序列中某一位的数字;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/28 15:56
 * @Created by mmz
 */
public class Solution {
    public static  int returnNumber(int n){
        if(n<0){
            return -1;
        }
        int digit = 1;
        while(true){
            int digitnumber = getNumberAll(digit);
            int countnumber = digit*digitnumber;
            if(n < countnumber){
                return digitAtIndex(n,digit);
            }else{
                n = n-countnumber;
                digit++;
            }
        }
    }
    private static int beginNumberFor(int digits)
    {
        if (digits == 1)
            return 0;

        return (int) Math.pow(10, digits - 1);
    }



    private static int digitAtIndex(int index, int digits)
    {
        //对应的数值
        int number = beginNumberFor(digits) + index / digits;
        //从数值右边开始算的位置
        int indexFromRight = digits - index % digits;
        //去除右边的indexFromRight-1个数字
        for (int i = 1; i < indexFromRight; i++)
            number /= 10;
        //求个位数字
        return number % 10;
    }


    public static int getNumberAll(int digits){
        if(digits ==1){
            return 10;
        }
        int count = (int)Math.pow(10,digits-1);
        return 9*count;
    }

    public static void main(String[] args) {
        System.out.println(Solution.returnNumber(19));
    }

}
