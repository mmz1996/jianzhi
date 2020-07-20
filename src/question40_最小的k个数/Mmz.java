package question40_最小的k个数;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/20 22:22
 * @Created by mmz
 */
public class Mmz {
    static List<Integer> Core(int[] arr ,int k){
        List<Integer> list = new ArrayList<>();
        if(arr.length <k){
            return list;
        }
        CoreFind(arr,k,0,arr.length-1);
        for(int i = 0;i<k;++i){
            list.add(arr[i]);
        }
        return list;
    }

    static void CoreFind(int[] arr,int k,int start,int end){
        if(start<end){
            int pos = CoreFindk(arr,start,end);
            if(pos == k-1){
                return;
            }else if(pos < k-1){
                CoreFind(arr,k,pos+1,end);
            }else{
                CoreFind(arr,k,start,pos-1);
            }
        }
    }
    static int CoreFindk(int[] arr,int start,int end){
        int temp =arr[start];
        while(start < end){
            while(start<end && arr[end] >=temp){
                end--;
            }
            arr[start] = arr[end];
            while (start<end && arr[start] <=temp){
                start++;
            }
            arr[end] = arr[start];
        }
        arr[start] =temp;
        return start;
    }
    public static void main(String[] args) {
        System.out.println(Core(new int[]{4, 5, 1, 6, 2, 7, 3, 8,9,0}, 7));
    }
}
