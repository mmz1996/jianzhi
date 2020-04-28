package question3_数组中重复的数字不能修改数组;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 14:47
 * @Created by mmz
 */
public class Main {
    public static int Core(int[] arr){
        int length = arr.length;
        int start = 1;
        int end = length-1;
        while(start<=end){
            int mid = (start+end)/2;
            int count =Count(arr,start,mid);
            if(start == end){
                if(count>1){
                    return start;
                }else{
                    break;
                }
            }
            if(count>end-start+1){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return  -1;
    }
    public static int Count(int[] arr,int start,int end){
        if(arr == null){
            return 0;
        }
        int count = 0;
        for(int i = 0 ;i<arr.length;++i){
            if(arr[i] >=start && arr[i] <=end){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,5,7,3,2,6,7};
        System.out.println(Main.Core(arr));
    }
}
