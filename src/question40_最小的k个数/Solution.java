package question40_最小的k个数;

import java.util.ArrayList;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/28 14:31
 * @Created by mmz
 */
public class Solution {

    public static ArrayList<Integer> generateSolution(int[] input,int k){
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(input.length <k){
            return arrayList;
        }
        findMin(input,0,input.length-1,k);
        for(int i = 0;i<k;i++){
            arrayList.add(input[i]);
        }
        return arrayList;
    }

    public  static void findMin(int[] arr,int start,int end,int k){
       if(start<end){
           int pos = partition(arr,start,end);
           if(pos == k-1){
               return;
           }else if(pos < k -1){
               findMin(arr,pos+1,end,k);
           }else{
               findMin(arr,start,pos-1,k);
           }
       }
    }
    public static int partition(int[] arr,int start ,int end){
        int temp = arr[start];
        while(start<end){
            while(start<end && arr[end]<=temp){
                end--;
            }
            arr[start] = arr[end];
            while(start<end && arr[start]>=temp){
                start++;
            }
            arr[end] = arr[start];
        }
        arr[start] = temp;
        return start;
    }

    public static void main(String[] args) {
        System.out.println(generateSolution(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 4));
    }
}
