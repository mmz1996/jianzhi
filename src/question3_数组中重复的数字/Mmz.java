package question3_数组中重复的数字;


import com.sun.org.apache.bcel.internal.generic.I2B;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 0:45
 * @Created by mmz
 */
public class Mmz {
    public static int Core(int[] nums){
        for(int i = 0;i<nums.length;++i){

            while(nums[i] != i){
                if(nums[nums[i]] == nums[i]){
                    return nums[i];
                }else{
                    int temp = nums[i];
                    nums[i] = nums[temp];
                    nums[temp] = temp;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,2,2,6,4,5};
        System.out.println(Core(arr));

    }
}
