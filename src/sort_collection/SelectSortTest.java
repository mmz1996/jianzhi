package sort_collection;

/**
 * @Classname SelectSortTest
 * @Description TODO
 * @Date 2020/3/3 20:24
 * @Created by mmz
 */
public class SelectSortTest {
    public static void selectSort(int[] arr){
        for(int i = 0;i<arr.length;++i){
            int min = i;
            for(int j = i+1;j<arr.length;++j) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]  = temp;
        }
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
        selectSort(arr);
        printArr(arr);
    }
}
