package question9_两个栈实现一个队列;

import java.util.Stack;

/**
 * @Classname Solution3
 * @Description TODO
 * @Date 2020/3/31 16:38
 * @Created by mmz
 */
public class Solution3 {

    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    private static void pushElement(Integer integer){
       stack1.push(integer);
    }

    private static Integer popElement()  {
        if(stack2.size() == 0){
            if(stack1.size() == 0){
                return -1;
            }else{
                while(stack1.size() != 0){
                    stack2.push(stack1.pop());
                }
            }
        }
           return stack2.pop();
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        solution.pushElement(4);
        solution.pushElement(5);
        solution.pushElement(6);
        try{
            System.out.println(solution.popElement());
            System.out.println(solution.popElement());
            System.out.println(solution.popElement());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
