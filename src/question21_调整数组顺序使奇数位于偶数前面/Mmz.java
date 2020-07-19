package question21_调整数组顺序使奇数位于偶数前面;

import java.util.Arrays;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 14:48
 * @Created by mmz
 */
public class Mmz {
    static int[] Core(int[] num){
        if(num == null || num.length <=0){
            return null ;
        }
        int start = 0;
        int end = num.length-1;
        while(start<=end){
            while(num[start]% 2 != 0 && start<=end){
                start++;
            }
            while(num[end]%2 == 0 && start<=end){
                end--;
            }
            if(start<end) {
                int temp = num[start];
                num[start] = num[end];
                num[end] = temp;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Core( new int[]{1,6,9,3,2,6,5})));
    }
}
