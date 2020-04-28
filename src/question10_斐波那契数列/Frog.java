package question10_斐波那契数列;

/**
 * @Classname Frog
 * @Description TODO
 * @Date 2020/3/8 14:29
 * @Created by mmz
 */
public class Frog {
    public static int jump(int n){
        int[] result = new int[]{1,2};
        int answer = 0 ;
        int one = result[0];
        int two = result[1];
        if(n<0){
            return -1;
        }
        if(n<=1){
            return result[n];
        }
        for(int i =2;i<=n;++i){
            answer = one + two;
            one = two;
            two = answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(jump(5));
    }
}
