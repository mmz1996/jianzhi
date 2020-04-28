package question39_数组中出现次数超过一半的数字;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/28 14:03
 * @Created by mmz
 */
public class Solution {
    public int findHalf(int[] arr){
        if(arr == null || arr.length<=0){
            return 0;
        }
        int result = arr[0];
        int count = 1;
        for(int i = 1;i<arr.length;++i){
            if(count == 0){
                result = arr[i];
                count++;
            }else if(result == arr[i]){
                count++;
            }else{
                count--;
            }
        }
        if(count > 0 ){
            int times = 0;
            for(int  i = 0 ;i<arr.length;++i){
                if (arr[i] == result){
                    times++;
                }
            }
            if(times * 2 >arr.length){
                return result;
            }
        }
        return 0;

    }
}
