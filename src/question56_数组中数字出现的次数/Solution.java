package question56_数组中数字出现的次数;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/29 23:49
 * @Created by mmz
 */
public class Solution {
    public void FindNumAppearOnce(int[] arr,int[] num1,int[] num2){
        if(arr == null || arr.length<2){
            return;
        }

        //定义一个异或结果
        int xor = 0;
        for(int i:arr){
            xor ^= i;
        }
        //我们要找到第一个索引为1的位置
        int index = 0;
        while(xor >0 && (xor &1)==0){
            xor >>=1;
            index++;
        }

        for(int num :arr){
            if(((num>>index) &1)>0){
                num1[0] ^=num;
            }else{
                num2[0] ^= num;
            }
        }
    }
}
