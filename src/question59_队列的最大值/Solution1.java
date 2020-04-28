package question59_队列的最大值;

/**
 * @Classname Solution1
 * @Description 蛮力法解决问题
 * @Date 2020/3/30 13:02
 * @Created by mmz
 */
public class Solution1 {
    static void printMax(int[] arr,int k){
        if(arr == null || arr.length<0||k<=0||k>arr.length){
            return;
        }
        int length = arr.length;
        for(int i = 0; i<length-k+1;++i){
            int max = 0;
            for(int j = i;j<i+3;++j){
                if(arr[j]>max){
                    max = arr[j];
                }
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        printMax(new int[]{2,3,4,2,6,2,5,1},3);
    }
}
