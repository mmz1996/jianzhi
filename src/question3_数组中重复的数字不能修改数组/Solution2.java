package question3_数组中重复的数字不能修改数组;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2020/3/6 20:01
 * @Created by mmz
 */
public class Solution2 {
    public int solution2(int[] arr){
        if(arr == null || arr.length < 0){
            return -1;
        }
        for(int a: arr){
            if(a < 1 || a>arr.length-1){
                return -1;
            }
        }
        int low = 1;
        int high = arr.length-1;
        int mid,count;

        while(low<=high){
            mid = ((high - low)>>2)+low;
            count = countRange(arr,low,high);
            if(low == high){
                return low;
            }
            if(count > mid -low +1){
                high = mid;
            }else{
                low = mid +1;
            }
        }
        return -1;

    }

    public int countRange(int[] arr,int low ,int high){
        if(arr == null){
            return 0;
        }
        int count = 0;
        for(int a: arr){
            if(a >=low && a<=high){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,5,7,3,2,6,7};
        System.out.println(Solution1.solution(arr));
    }
}
