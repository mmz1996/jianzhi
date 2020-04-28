package question3_数组中重复的数字不能修改数组;

import java.util.HashMap;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/3/6 16:26
 * @Created by mmz
 */
public class Solution1 {
    public static int solution(int[] arr){

        HashMap<Integer,Integer> map  = new HashMap<Integer, Integer>();
        for(int i = 0;i<arr.length;++i){
            if(map.get(arr[i]) == null){
                map.put(arr[i],i);
            }else{
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,4,3,2,6,7};
        System.out.println(Solution1.solution(arr));
    }

}
