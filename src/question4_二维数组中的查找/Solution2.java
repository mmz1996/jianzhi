package question4_二维数组中的查找;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2020/3/31 13:45
 * @Created by mmz
 */
public class Solution2 {
    static boolean findNumber(int[][] arr,int number){
        int xend = arr.length-1;
        int yend = arr[0].length-1;
        int i = 0;
        int j = yend;
        while(0<=i&& i<=xend && 0<=j &&j<=yend){
            int temp = arr[i][j];
            if(arr[i][j] == number){
                return true;
            }
            if(number>arr[i][j]){
                i++;
            }else if(arr[i][j]>number){
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int number = 1;
        System.out.println(findNumber(arr, number));
    }
}
