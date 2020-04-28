package question50_只出现一次的字符串;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/29 16:17
 * @Created by mmz
 */
public class Solution {

    public int FirstNotRepeateChar(String string){
        if (string ==null){
            return -1;
        }
        int[] value = new int[256];
        char[] chars  = string.toCharArray();
        int n =chars.length;
        for(int i =0;i<n;++i){
            value[i] = 0;
        }
        char[] hashKey =chars;
        for(int i =0;i<n;++i){
            int temp = hashKey[i];
            value[temp]++;
        }
        for(int i =0;i<n;++i){
            if(value[hashKey[i]] == 1){
                return i;
            }
        }
        return -1;
    }
}
