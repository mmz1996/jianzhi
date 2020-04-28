package question3_数组中重复的数字;


/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 14:25
 * @Created by mmz
 */
public class Main {
    public static int Core(int[] arr){
        for(int i = 0;i<arr.length;++i){
            while (arr[i] !=i){
                if(arr[arr[i]] == arr[i]){
                    return arr[i];
                }else{
                    int temp = arr[i];
                    arr[i] = arr[temp];
                    arr[temp] = temp;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0,2,1,5,3,4,5};
        System.out.println(Main.Core(arr));

    }
}
