package sort_collection;

/**
 * @Classname QuickSortTest
 * @Description TODO
 * @Date 2020/3/3 21:50
 * @Created by mmz
 */
public class QuickSortTest {

    public static void quickSort(int[] arr,int left,int right){
        int len;
        if(arr == null
                || (len = arr.length) == 0
                || len == 1) {
            return ;
        }
        if(left > right) {
            return;
        }
        int base = arr[left];
        int i = left;
        int j = right;
        while(i < j){
            while(arr[j] >= base && i < j){
                j--;
            }
            while(arr[i] <= base &&i < j){
                i++;
            }
            if(i < j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] =temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = base;

        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }

    public static void printArr(int[] arr){
        for(int i = 0;i<arr.length;++i){
            System.out.print(arr[i]+ " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,7,3,9,4,0,5};
        printArr(arr);
        System.out.println("-----------");
        int left = 0;
        int right = arr.length-1;
        quickSort(arr,left,right);
        printArr(arr);
    }
}
