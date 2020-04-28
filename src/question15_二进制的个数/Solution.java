package question15_二进制的个数;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/9 1:57
 * @Created by mmz
 */
public class Solution {
    public static int numberOf(int n){
        int count = 0;
        while(n >0){
            n &= (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Solution.numberOf(29));
    }
}
