package question9_两个栈实现一个队列;

import java.util.Stack;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 15:54
 * @Created by mmz
 */
public class Main {
    static Stack<Integer> add = new Stack<>();
    static Stack<Integer> remove = new Stack<>();

    public static void appendTail(int item){
        add.push(item);
    }

    public static int deleteHead() throws Exception{
        if(remove.size() == 0 && add.size() == 0){
            throw new Exception("队列为空,无法删除");
        }
        if(remove.size() == 0 && add.size() != 0){
            while(add.size() != 0){
                int item = add.pop();
                remove.add(item);
            }
        }
        return remove.pop();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.appendTail(4);
        main.appendTail(5);
        main.appendTail(6);
        try{
            System.out.println(main.deleteHead());
            System.out.println(main.deleteHead());
            System.out.println(main.deleteHead());
            System.out.println(main.deleteHead());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
