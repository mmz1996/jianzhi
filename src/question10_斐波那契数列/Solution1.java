package question10_斐波那契数列;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/3/8 14:16
 * @Created by mmz
 */
public class Solution1 {
    public static int solution(int n){
        int[] result = new int[]{0,1};
        if(n<0){
            return -1;
        }
        if(n <= 2){
            return result[n];
        }
        int all = 0;
        int one = result[0];
        int two = result[1];
        for(int i =2;i<=n ;++i){
            all = one + two;
            one = two;
            two = all;
        }
        return all;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
