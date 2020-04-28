package question57_和为s的数字;

import java.util.HashMap;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/30 0:11
 * @Created by mmz
 */
public class Solution {

    static void getAll(int[] arr,int target){
        int[] ints =  new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0 ;i<arr.length;++i){
            if(hashMap.containsKey(target- arr[i])){
                ints[0] = arr[i];
                ints[1] = target-arr[i];
                break;
            }else{
                hashMap.put(arr[i],target-arr[i]);
            }
        }
        for(int i :ints){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr= new int[]{1,2,4,7,11,15};
        getAll(arr,15);
    }
}
