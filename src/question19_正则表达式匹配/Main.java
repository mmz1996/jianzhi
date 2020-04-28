package question19_正则表达式匹配;

import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 20:33
 * @Created by mmz
 */
public class Main {

    public static boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        int strIndex = 0;
        int patternIndex = 0;
        return matchCore(str, strIndex, pattern, patternIndex);

    }
    private static boolean matchCore(char[] str,int strIndex, char[] pattern,int patternIndex) {
        //如果都匹配到尾了成功
        if (strIndex == str.length && patternIndex == pattern.length)
            return true;
        //如果模式到尾，字符串没到尾，匹配失败
        if (strIndex != str.length && patternIndex == pattern.length)
            return false;

        //模式第二个字符是*
        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            //第一个位置相同 或者 模式第一个位置为. 即任意字符
            if (str[strIndex] == pattern[patternIndex] && strIndex != str.length || pattern[patternIndex] == '.' && strIndex != str.length) {
                //分三种情况递归
                return matchCore(str, strIndex, pattern, patternIndex + 2)//视x*匹配0个字符，即*前一个字符出现0次 情况b1
                        || matchCore(str, strIndex + 1, pattern, patternIndex + 2)//匹配1个字符，即*前一个字符仅出现1次 情况b2
                        || matchCore(str, strIndex + 1, pattern, patternIndex);//匹配1个字符，模式保持不变 情况b3
            } else {
                //第一个位置不匹配，模式后移两位  也就是视x*匹配0个字符 情况c1
                return matchCore(str, strIndex, pattern, patternIndex + 2);
            }
        }

        //第一个字符匹配，但模式第二个不是* 模式和字符串上都后移一位 情况a1
        if (strIndex != str.length && (str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')) {
            return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
        } else {
            return false;//第一个字符不匹配并且模式第二个位置不是* 情况a2
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
