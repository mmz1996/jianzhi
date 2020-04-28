package question11_旋转数组最小的数字;

import java.util.Arrays;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/3/8 16:32
 * @Created by mmz
 */
public class Solution1 {
    public static int findMin(int[] arr){
        int max = arr.length-1;
        int min = 0;
        int mid = (max+min)/2;
        if(max == min){
            return arr[max];
        }
        if(arr[max] > arr[min]){
            return arr[min];
        }
        if(arr[max] == arr[min] &&arr[max]== arr[mid]){
            Arrays.sort(arr);
            return arr[0];
        }
        while(min<max &&(max-min) != 1){
            mid = (max+min)/2;
            if(arr[mid] >= arr[min]){
                min = mid;
            }else{
                max = mid;
            }
        }
        return arr[max];
    }

    public static void main(String[] args) {
        int[] arr =new int[]{1,0,1,1};
        System.out.println(findMin(arr));
    }
}
