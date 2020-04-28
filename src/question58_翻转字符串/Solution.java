package question58_翻转字符串;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/30 0:32
 * @Created by mmz
 */
public class Solution {
    static void reverse(char[] data,int begin,int end){
        if (data==null||data.length<0||begin<0||end>data.length||begin>end)
        {
            return;
        }
        //首尾一一交换
        while (begin<end)
        {
            char temp=data[begin];
            data[begin]=data[end];
            data[end]=temp;

            begin++;
            end--;
        }
    }

    static char[] reverseMain(String string){
        char[] data  = string.toCharArray();
        if (data==null||data.length<0)
            return null;

        //翻转整个句子
        reverse(data,0,data.length-1);
        //可以用一个输出语句来观察此时的data
        System.out.println(data);

        //翻转句子中的每个单词
        int begin=0;
        int end=0;
        while (begin<data.length) {
            if (data[begin] == ' ') {
                begin++;
                end++;
            }

            else if (end == data.length || data[end] == ' ') {
                reverse(data, begin, end - 1);
                end++;
                begin = end;
            } else {
                end++;
            }
        }
        //可以返回String类型或是char[]类型，注意：与函数对应的返回值类型是否匹配
        //return new String(data);
        return data;

    }
}
