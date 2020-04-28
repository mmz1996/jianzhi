package question3_数组中重复的数字;

import java.util.HashMap;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2020/3/3 23:07
 * @Created by mmz
 */
public class Solution2 {
    public static boolean hastMapSolution(int[] arr){
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i= 0;i<arr.length;++i){
            if(hashMap.containsKey(arr[i])){
                System.out.println(arr[i]);
                return true;
            }
            hashMap.put(arr[i],i);
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,2,1,2,3,4,5};
        Solution2.hastMapSolution(arr);

    }

}
