package question14_剪绳子;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 21:50
 * @Created by mmz
 */
public class Mmz {
    public static int Core(int length){
        if(length<2){
            return 0;
        }
        if(length == 2){
            return 1;
        }
        if(length == 3){
            return 2;
        }
        int[] dp =new int[length+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int i = 4;i<=length;i++){
            int max = 0;
            for(int j = 1;j<=i/2;++j){
                if(max <dp[j]*dp[i-j]){
                    max = dp[j]*dp[i-j];
                }
            }
            dp[i] = max;
        }
        return dp[length];
    }
    public static void main(String[] args) {
        System.out.println(Core(8));
    }
}
