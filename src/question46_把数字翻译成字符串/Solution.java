package question46_把数字翻译成字符串;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/28 21:06
 * @Created by mmz
 */
public class Solution {

    public static int translateToString(int number){
        if(number<0){
            return 0;
        }
        return translate(String.valueOf(number));
    }

    public static int translate(String string){
        int length = string.length();
        int[] countRecords = new int[length];
        countRecords[length-1] = 1;
        int count;
        for (int i = length - 2; i >= 0; i--)
        {
            //f(i+1)
            count = countRecords[i + 1];
            int digit1 = string.charAt(i) - '0';
            int digit2 = string.charAt(i + 1) - '0';
            int connectedNumber = digit1 * 10 + digit2; //拼接两个数字
            //拼接的数字在10~25范围内
            if (connectedNumber >= 10 && connectedNumber <= 25)
            {
                if (i < length - 2)
                {
                    //f(i) = f(i+1) + f(i+2)
                    count += countRecords[i + 2];
                } else if (i == length - 2)
                {
                    count += 1;  //拼接的数字只有一种翻译方式
                }
            }
            countRecords[i] = count;
        }
        count = countRecords[0];
        return count;
    }

    public static void main(String[] args) {
        System.out.println(translateToString(213));
    }
}
