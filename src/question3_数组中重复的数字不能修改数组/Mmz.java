package question3_数组中重复的数字不能修改数组;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 12:23
 * @Created by mmz
 */
public class Mmz {
    public int Core(int[] num){
        int start = 0 ;
        int end = num.length;
        while(start<=end){
            int mid = (start+end)/2;
            int count = Count(start,mid,num);
            if(start == end){
                if(count > 1){
                    return  start;
                }else{
                    break;
                }
            }
            if(count > mid-start+1){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public int Count(int start,int end,int[] nums){
        int count = 0 ;
        if(nums == null){
            return 0;
        }
        for(int i = 0 ;i<nums.length;++i){
            if(nums[i]>=start && nums[i]<=end){
                count++;
            }
        }
        return count;
    }
}
