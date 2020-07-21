package question47_礼物的最大值;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/21 23:12
 * @Created by mmz
 */
public class Mmz {
    static int Core(int[][] num){
        int[] dp =new int[num[0].length];
        for(int i = 0;i<num.length;++i){
            for(int j = 0;j<num[0].length;++j){
                if(i == 0){
                    dp[j] = num[i][j];
                }else if(j == 0){
                    dp[j] +=num[i][j];
                }else{
                    dp[j] = Math.max(dp[j]+num[i][j],dp[j-1]+num[i][j]);
                }

            }
        }
        return dp[num[0].length-1];
    }

    public static void main(String[] args) {
        int[][] number = new int[][]{{1,10,3,8},{12,2,9,6},{5,7,4,11},{3,7,16,5}};
        System.out.println(Core(number));
    }
}
