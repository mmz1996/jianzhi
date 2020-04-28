package question47_礼物的最大值;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/28 22:19
 * @Created by mmz
 */
public class Solution {
    public static int getMaxGirft(int[][] number){
        int row = number.length;
        int col = number[0].length;
        int[] maxValue = new int[col];

        for(int i =0;i<row;++i){
            for(int j =0;j<col;++j){
                int up = 0;
                int left = 0;
                if(i>0){
                    up = maxValue[j];
                }

                if(j>0){
                    left = maxValue[j-1];
                }


                maxValue[j] = Math.max(up,left)+number[i][j];
            }
        }
        return maxValue[col-1];
    }

    public static void main(String[] args) {
        int[][] number = new int[][]{{1,10,3,8},{12,2,9,6},{5,7,4,11},{3,7,16,5}};
        System.out.println(getMaxGirft(number));
    }
}
