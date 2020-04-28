package question4_二维数组中的查找;


/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/3/7 2:23
 * @Created by mmz
 */
public class Solution1 {
    public static boolean findsolution(int[] arr,int row,int col,int number){

        boolean found = false;
        if(arr!= null && row>0&& col>0){
            int rows = 0;
            int cols = col-1;
            while(rows<row && cols>0){
                if(number ==arr[rows*col+cols]){
                    found = true;
                    break;
                }else if(number >arr[rows*col+cols]){
                    rows++;
                }else{
                    cols--;
                }
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,8,9,2,4,9,12,4,7,10,13,6,8,11,15};
        System.out.println(Solution1.findsolution(arr, 4, 4, 119));
    }
}
