package question42_连续子数组的最大和;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/28 15:32
 * @Created by mmz
 */
public class Solution {
    public static int findMax(int[] arr){
        int pre = 0;
        int max = 0;
        for(int i = 0;i<arr.length;++i){
            if(pre<0){
                pre = arr[i];
            }else{
                pre =arr[i]+pre;
            }
            if(max<pre){
                max = pre;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,-2,3,10,-4,7,2,-5};
        System.out.println(Solution.findMax(arr));
    }
}
