package question61_扑克牌中的顺子;

import java.util.Arrays;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/30 19:23
 * @Created by mmz
 */
public class Solution {

    static boolean isPu(int[] arr,int length){
        if(arr == null || length<1){
            return false;
        }
        Arrays.sort(arr);

        int numberOfZero = 0;
        int numberOfGap = 0;

        for(int i = 0 ;i<length;++i){
            if(arr[i] == 0 ){
                numberOfZero++;
            }
        }
        int small = numberOfZero;
        int big =numberOfZero+1;
        while(big<length){
            if(arr[big] == arr[big+1]){
                return false;
            }
            numberOfGap += arr[big]-arr[small]-1;
            small = big ;
            big++;
        }
        return (numberOfGap>numberOfZero)?false:true;
    }
}
