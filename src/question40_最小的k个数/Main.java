package question40_最小的k个数;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/12 15:16
 * @Created by mmz
 */
public class Main {

    static List<Integer> Core(int[] arr ,int k){
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(arr.length<k){
            return arrayList;
        }
        CoreFind(arr,k,0,arr.length-1);
        for(int i = 0;i<k;++i){
            arrayList.add(arr[i]);
        }
        return arrayList;
    }

    static void CoreFind(int[] arr,int k,int start,int end){
        if(start<end){
            int pos = CoreFindK(arr,start,end);
            if(pos == k-1){
                return;
            }else if(pos<k-1){
                CoreFind(arr,k,k+1,end);
            }else{
                CoreFind(arr,k,start,k-1);
            }
        }
    }

    static int CoreFindK(int[] arr, int start,int end){
        int temp = arr[start];
        while(start<end){
            while(start<end && arr[end]>=temp){
                end--;
            }
            arr[start] = arr[end];
            while(start<end && arr[start]<=temp){
                start++;
            }
            arr[end] = arr[start];
        }
        arr[start] = temp;
        return start;
    }

    public static void main(String[] args) {
        System.out.println(Core(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 4));
    }
}
