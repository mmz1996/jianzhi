package sort_collection;

/**
 * @Classname BubbleSortTest
 * @Description TODO
 * @Date 2020/3/3 17:48
 * @Created by mmz
 */
public class BubbleSortTest {
    public static void bubbleSort(int[] arr){
        for(int i = 0;i<arr.length-1;++i){
            for(int j = 0;j<arr.length-1-i;++j){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        System.out.println("------");
        bubbleSort(arr);
        printArr(arr);
    }
}
