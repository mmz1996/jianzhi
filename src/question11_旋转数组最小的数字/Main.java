package question11_旋转数组最小的数字;

import java.util.Arrays;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 16:12
 * @Created by mmz
 */
public class Main {

    static int Core(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        if(arr[start] == arr[mid] && arr[mid] == arr[end]){
            Arrays.sort(arr);
            return arr[0];
        }
        if(arr[start]<arr[end]){
            return arr[start];
        }
        while(start != end-1){

            if(arr[mid] >=arr[start]){
                start = mid;
            }else{
                end = mid;
            }
            mid = (start+end)/2;
        }
        return arr[end];
    }

    public static void main(String[] args) {
        System.out.println(Core(new int[]{1,1,0,1,1,1,1,1}));
    }
}
