package question11_旋转数组最小的数字;

import java.util.Arrays;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2020/3/31 17:42
 * @Created by mmz
 */
public class Solution2 {
    static int findMin(int[] arr){
        if(arr[arr.length-1]>arr[0]){
            return arr[0];
        }
        int start = 0;
        int end = arr.length-1;
        int middle =(start+end)/2;
        if(arr[middle] == arr[start] && arr[middle] == arr[end]){
            Arrays.sort(arr);
            return arr[0];
        }
        while(end - start !=1){
            middle = (start+end)/2;
            if(arr[middle]>arr[start]){
                start = middle;
            }else if(arr[middle]<arr[end]){
                end = middle;
            }

        }
        return arr[end];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
    }
}
