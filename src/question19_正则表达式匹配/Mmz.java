package question19_正则表达式匹配;

import java.util.Scanner;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 14:06
 * @Created by mmz
 */
public class Mmz {
    public static boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        int strIndex = 0;
        int patternIndex = 0;
        return matchCore(str, strIndex, pattern, patternIndex);

    }
    private static boolean matchCore(char[] str,int strIndex, char[] pattern,int patternIndex) {
        if(strIndex == str.length && patternIndex == pattern.length){
            return true;
        }
        if(str.length  != strIndex && pattern.length == patternIndex){
            return false;
        }

        if(patternIndex+1<pattern.length && pattern[patternIndex+1] == '*'){
            if(str[strIndex] == pattern[patternIndex] && str.length != strIndex || pattern[patternIndex] == '.' && str.length != strIndex){
                return matchCore(str,strIndex,pattern,patternIndex+2)||
                        matchCore(str,strIndex+1,pattern,patternIndex+2)||
                        matchCore(str,strIndex+1,pattern,patternIndex);
            }else {
                return matchCore(str, strIndex, pattern, patternIndex + 2);
            }
        }



        if(str.length != strIndex && (str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')){
            return matchCore(str,strIndex+1,pattern,patternIndex+1);
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String a = in.nextLine();
            String b = in.nextLine();

            System.out.println(match(a.toCharArray(), b.toCharArray()));
        }
    }
}
