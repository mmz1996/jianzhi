package question42_连续子数组的最大和;

import com.sun.org.glassfish.external.amx.AMX;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/12 15:43
 * @Created by mmz
 */
public class Main {
    static int Core(int[]arr){
        if(arr.length<=0 || arr == null){
            return 0;
        }
        int cur = arr[0];
        int max = arr[0];
        for(int i = 1;i<arr.length;++i){
            if(cur <=0){
                cur = arr[i];
            }else{
                cur = cur+arr[i];
            }
            if(max < cur){
                max = cur;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(Core(new int[]{1, -2, 3, 10, -4, 7, 2, -5}));
    }

}
