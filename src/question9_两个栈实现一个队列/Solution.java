package question9_两个栈实现一个队列;

import java.util.Stack;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/7 23:05
 * @Created by mmz
 */
public class Solution {
    public static class Queue{
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        Queue(){
            stack1 = new Stack<Integer>();
            stack2 = new Stack<Integer>();
        }
    }

    public static void appendTail(Queue queue,int item){
        for(int i = 0;i<queue.stack1.size()+queue.stack2.size();++i){
            int temp = queue.stack1.pop();
            queue.stack2.push(temp);
        }
        queue.stack2.push(item);
        for(int i = 0;i<queue.stack1.size()+queue.stack2.size();++i){
            int temp = queue.stack2.pop();
            queue.stack1.push(temp);
        }
    }

    public static int deleteHead(Queue queue){

        return queue.stack1.pop();
    }

    public static void print(Queue queue){
        for(int i=0;i<queue.stack1.size()+queue.stack2.size();++i){
            int temp = queue.stack1.pop();
            System.out.print(temp);
            queue.stack2.push(temp);
        }
        for(int i = 0;i<queue.stack1.size()+queue.stack2.size();++i){
            int temp = queue.stack2.pop();
            queue.stack1.push(temp);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        appendTail(queue,1);
        appendTail(queue,2);
        appendTail(queue,3);
        deleteHead(queue);
        appendTail(queue,1);
        appendTail(queue,2);
        appendTail(queue,3);
        deleteHead(queue);
        print(queue);
    }
}
