package question30_contain_min_stack;

import java.util.Stack;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 22:52
 * @Created by mmz
 */
public class Main {
    static Stack<Integer> data = new Stack<>();
    static Stack<Integer> min = new Stack<>();

    static int pop(){
        if(data.size() == 0){
            System.out.println("栈为空");
            return -1;
        }else{
            min.pop();
            return data.pop();
        }
    }
    static void push(int num){
        if(data.size() == 0){
            min.push(num);
        }
        data.push(num);
        if(num > min.peek()){
            min.push(min.peek());
        }else{
            min.push(num);
        }
    }

    static int getMin(){
        return min.peek();
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
