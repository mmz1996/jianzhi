package question15_二进制的个数;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/3/31 22:00
 * @Created by mmz
 */
public class Solution1 {

    static int count1(int number){
        int count = 0;
        while(number !=0){
            if((number &1) == 1){
                count++;
            }
            number = number >>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count1(9));
    }
}
