package question63_股票的最大利润;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/12 14:45
 * @Created by mmz
 */
public class Main {
    static int Core(int[] arr){
        int min = arr[0];
        int max = arr[1]-min;

        for(int i =2 ;i<arr.length;++i){
            if(arr[i-1] <min){
                min = arr[i-1];
            }
            int cur = arr[i]-min;
            if(cur>max){
                max = cur;
            }
        }
        return arr[arr.length-1];
    }
}
