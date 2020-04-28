package question3_数组中重复的数字;

/**
 * @Classname Solution4
 * @Description TODO
 * @Date 2020/3/31 0:19
 * @Created by mmz
 */
public class Solution4 {
    static int findRepeateNumber(int[] arr,int length){
        for(int i = 0 ;i<length;++i){
            while(i != arr[i]){
                if(arr[i] == arr[arr[i]]){
                    return arr[i];
                }else{
                    int temp = arr[i];
                    arr[i] = arr[temp];
                    arr[temp] = temp;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,1,0,2,5,3};
        System.out.println(findRepeateNumber(arr, arr.length));
    }
}
