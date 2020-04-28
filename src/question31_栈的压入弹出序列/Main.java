package question31_栈的压入弹出序列;

import java.util.Stack;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 23:16
 * @Created by mmz
 */
public class Main {
    static Stack<Integer> stack = new Stack<>();

    static boolean Core(int[] arr1,int[] arr2){
        int j = 0;
        for(int i = 0;i<arr1.length;++i){
            stack.push(arr1[i]);
            while(!stack.isEmpty() && stack.peek() == arr2[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 =new int[]{4,3,5,1,2};
        System.out.println(Core(arr1, arr2));
    }
}
