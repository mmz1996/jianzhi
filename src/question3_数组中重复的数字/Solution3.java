package question3_数组中重复的数字;

/**
 * @Classname Solution3
 * @Description TODO
 * @Date 2020/3/3 23:22
 * @Created by mmz
 */
public class Solution3 {
    public static boolean solution3(int[] arr){
        if(arr == null || arr.length == 0){
            return false;
        }
        for(int i = 0 ;i<arr.length;++i){
            while(i != arr[i]){
                if(arr[i] == arr[arr[i]]){
                    System.out.println(arr[i]);
                    return true;
                }
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,2,1,3,3,4,5};
        Solution3.solution3(arr);

    }
}
