package question48_最长不含重复字符的子字符串;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/29 0:00
 * @Created by mmz
 */
public class Solution {
    public static int findNoRepeate(String str){
        if(str == ""||str==null||str.length()<=0){
            return 0;
        }
        char[] chars = str.toCharArray();
        int[] max = new int[str.length()];
        max[0] = 1;
        int curLength = 1 ;
        boolean flag =false;
        for(int i =1;i<chars.length;++i){
            flag = false;
            for(int j=0;j<i;++j){

                if(chars[i]==chars[j]){
                    curLength= i-j;
                    if(curLength>max[i-1]){
                        curLength = max[i-1];
                    }
                    flag=true;
                }
            }
            if(!flag){
                curLength++;
            }
            if(max[i-1]<curLength){
                max[i] = curLength;
            }else{
                max[i] = max[i-1];
            }
        }
        int maxNum = 0;
        for(int i=0;i<str.length();++i){
            if(max[i]>maxNum){
                maxNum = max[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println(findNoRepeate("arabcacfr"));
    }
}
