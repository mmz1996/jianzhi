package question31_栈的压入弹出序列;

import java.util.Stack;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/27 13:51
 * @Created by mmz
 */
public class Solution {
    public static boolean isPop(int[] pusha,int[] pushb){
        if(pusha == null || pushb ==null){
            return false;
        }

        Stack<Integer> stack = new Stack<>();

        int j = 0;
        for(int i =0;i<pusha.length;i++){
            stack.push(pusha[i]);
            while(!stack.isEmpty() &&stack.peek() == pushb[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
