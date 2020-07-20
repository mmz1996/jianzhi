package question40_最小的k个数;

import java.util.ArrayList;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/7/20 22:57
 * @Created by mmz
 */
public class Test {
        static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
            // 由于本题需要返回ArrayList<Integer>，所以新建之
            ArrayList<Integer> list = new ArrayList<>();
            // 若输入数组长度小于k。直接返回数空的ArrayList
            if(input.length < k){
                return list;
            }

            findKMin(input,0,input.length-1,k);
            for(int i = 0; i < k; i++){
                list.add(input[i]);
            }
            return list;
        }

        static void findKMin(int[] a, int start, int end, int k){
            if(start < end){
                int pos = partition(a, start, end);
                if(pos == k-1){
                    return ;
                }else if(pos < k-1){
                    findKMin(a,pos+1,end,k);
                }else{
                    findKMin(a,start,pos-1,k);
                }
            }
        }

        // 快排中的每次排序实现（挖坑填数法），返回的是交换后start位置（快排一次后的中轴点，中轴点左边全是小于它的，右边都是大于它的）
        static int partition(int[] a, int start, int end){
            int pivot = a[start];
            while(start < end){
                while(start < end && a[end] >= pivot){end--;};
                a[start] = a[end];
                while(start < end && a[start] <= pivot){start++;};
                a[end] = a[start];
            }
            a[start] = pivot;
            return start;
        }

    public static void main(String[] args) {
        System.out.println(GetLeastNumbers_Solution(new int[]{4, 5, 1, 6, 2, 7, 3, 8,9,0}, 7));
    }
}
