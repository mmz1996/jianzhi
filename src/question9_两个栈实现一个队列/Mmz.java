package question9_两个栈实现一个队列;

import java.util.Stack;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 18:35
 * @Created by mmz
 */
public class Mmz {
    static Stack<Integer> inStack = new Stack<>();
    static Stack<Integer> outStack = new Stack<>();
    public static void appendTail(int num){
        inStack.push(num);
    }

    public static int deleteHead(){
        if(outStack.size() != 0){
            return outStack.pop();
        }else{
            if(inStack.size() == 0){
                System.out.println("没有元素了");
                return -1;
            }else{
                while(inStack.size() != 0){
                    outStack.push(inStack.pop());
                }
                return outStack.pop();
            }
        }
    }

    public static void main(String[] args) {
        appendTail(6);
        appendTail(5);
        appendTail(4);
        appendTail(3);
        System.out.println(deleteHead());
        System.out.println(deleteHead());
        System.out.println(deleteHead());
        System.out.println(deleteHead());
        System.out.println(deleteHead());
    }

}
