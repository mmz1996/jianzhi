package question3_数组中重复的数字;

import java.util.Arrays;

/**
 * @Classname solution1
 * @Description 对数组进行排序，寻找重复的数字
 * @Date 2020/3/3 14:22
 * @Created by mmz
 */
public class solution1 {
    public static boolean findRepeatNumber(int[] arr){
        if(arr.length == 0 || arr == null){
            return false;
        }
        Arrays.sort(arr);
        for(int i = 0;i< arr.length-1;++i){
            if(arr[i] == arr[i+1]){
                System.out.println(arr[i]);
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,2,1,2,3,4,5};
        solution1.findRepeatNumber(arr);

    }
}
