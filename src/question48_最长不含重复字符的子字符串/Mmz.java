package question48_最长不含重复字符的子字符串;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/21 23:22
 * @Created by mmz
 */
public class Mmz {
    static int Core(String string){
        if(string == ""||string == null ||string.length()<=0){
            return 0;
        }
        char[] chars = string.toCharArray();
        int[] max = new int[string.length()];
        max[0] = 1;
        int curlength = 1;
        boolean flag = false;
        int maxNum = 0;

        for(int i =1;i<chars.length;++i){
            flag = false;
            for(int j =0;j<i;++j){
                if(chars[j] == chars[i]){
                    curlength = i-j;
                    if(curlength>max[i-1]){
                        curlength = max[i-1];
                    }
                    flag = true;
                }
            }
            if(!flag){
                curlength++;
            }
            if(max[i-1] <curlength){
                max[i] = curlength;
            }else{
                max[i] = max[i-1];
            }


        }


        for(int i=0;i<string.length();++i){
            if(max[i]>maxNum){
                maxNum = max[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println(Core("arabcacfr"));
    }
}
