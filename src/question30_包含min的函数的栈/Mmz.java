package question30_包含min的函数的栈;

import java.util.Stack;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 20:01
 * @Created by mmz
 */
public class Mmz {
    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int number){
        if(inStack.size() == 0){
            inStack.push(number);
            minStack.push(number);
        }else{
            if(minStack.peek() > number){
                minStack.push(number);
            }else{
                minStack.push(minStack.peek());
            }
            inStack.push(number);
        }
    }

    public int pop(){
        if(inStack.size() != 0){
            minStack.pop();
            return inStack.pop();
        }else{
            System.out.println("stack is empty");
        }
        return -1;
    }

    public int getMin(){
        return minStack.peek();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.push(3);
        main.push(4);
        main.push(2);
        main.push(1);
        main.pop();
        main.pop();
        System.out.println(main.getMin());
        main.push(0);
    }

}
