package sort_collection;

/**
 * @Classname InsertSortTest
 * @Description TODO
 * @Date 2020/3/3 21:15
 * @Created by mmz
 */
public class InsertSortTest {
    public static void insertSort(int[] arr){
        int current;
        for(int i = 0;i<arr.length -1 ;++i){
            current = arr[i+1];
            int previous = i;
            while(previous>=0&&current<arr[previous]){
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;
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
        insertSort(arr);
        printArr(arr);

    }
}
