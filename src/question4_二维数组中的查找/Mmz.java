package question4_二维数组中的查找;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 14:08
 * @Created by mmz
 */
public class Mmz {
    public static boolean Core(int[][] nums,int target){
        if(nums == null){
            return false;
        }
        int i = 0;
        int j = nums[0].length-1;
        while(j>=0 && i<nums.length){
            if(nums[i][j] == target){
                return true;
            }else if(nums[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int number = 40;
        System.out.println(Core(arr, number));
    }
}
