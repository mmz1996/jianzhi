package question31_栈的压入弹出序列;

import java.util.Stack;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 20:18
 * @Created by mmz
 */
public class Mmz {
    static Stack<Integer> stack = new Stack<>();

    static boolean Core(int[] num1,int[] num2){
        int j = 0;
        for(int i= 0;i<num1.length;++i){
            stack.push(num1[i]);
            while(!stack.isEmpty() && stack.peek() == num2[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 =new int[]{4,5,3,2,1};
        System.out.println(Core(arr1, arr2));
    }
}
