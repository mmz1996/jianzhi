package question49_丑数;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/3/29 11:15
 * @Created by mmz
 */
public class Solution1 {
    public static boolean isUgrly(int number){
        while(number%2 ==0){
            number /=2;
        }
        while(number%3 == 0){
            number /=3;
        }
        while (number%5 == 0){
            number /=5;
        }
        return (number==1)?true:false;
    }

    public static int printUgrly(int index){
        if(index<=0){
            return 0;
        }
        int number = 0;
        int count =0;
        while(number<index){
            ++number;
            if(isUgrly(number)){
                 count++;
            }
        }
        return count;
    }
}
