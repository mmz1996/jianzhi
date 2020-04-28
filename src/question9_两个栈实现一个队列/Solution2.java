package question9_两个栈实现一个队列;

import java.util.Stack;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2020/3/7 23:38
 * @Created by mmz
 */
public class Solution2 {
    public static class Queue{
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        Queue(){
            stack1 = new Stack<Integer>();
            stack2 = new Stack<Integer>();
        }
    }
    public static void appendTail(Queue queue,int number){
        queue.stack1.push(number);
    }

    public static int deleteHead(Queue queue){
        if(queue.stack2.size() == 0){
            if (queue.stack1.size() == 0){
                return -1;
            }else{
                for(int i = 0;i<queue.stack1.size()+queue.stack2.size();++i){
                    int temp = queue.stack1.pop();
                    queue.stack2.push(temp);
                }
                return queue.stack2.pop();
            }
        }else{
            return queue.stack2.pop();
        }
    }

    public static void print(Queue queue){
        for(int i = 0;i<queue.stack1.size()+queue.stack2.size();++i){
            int temp = queue.stack1.pop();
            queue.stack2.push(temp);
        }
        for(int i = 0;i<queue.stack2.size()+queue.stack1.size();++i){
            int temp = queue.stack2.pop();
            System.out.print(temp);
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
