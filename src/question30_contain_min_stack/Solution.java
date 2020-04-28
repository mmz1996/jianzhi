package question30_contain_min_stack;

import java.util.Stack;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/27 12:52
 * @Created by mmz
 */
public class Solution {

    private static Stack<Integer> stack1 =new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    public static void push(int value){
        stack1.push(value);

        if(stack2.isEmpty()){
            stack2.push(value);
        }else if(stack2.peek() >value){
            stack2.push(value);
        }else{
            stack2.push(stack2.peek());
        }
    }

    public static int pop() throws Exception {
        if(stack1.isEmpty()){
            throw new Exception("栈为空");
        }
        stack2.pop();
        return stack1.pop();
    }

    public static int getMin() throws Exception {
        if(stack2.isEmpty()){
            throw new Exception("栈为空");
        }
        return stack2.peek();
    }
}
