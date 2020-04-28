package question6_从尾到头打印链表;

import java.util.Stack;

/**
 * @Classname UseStack
 * @Description TODO
 * @Date 2020/3/7 15:52
 * @Created by mmz
 */
public class UseStack {
    static class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void useStackPrint(ListNode head){
        Stack<Integer> stack = new Stack<Integer>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        int[] nums = new int[stack.size()];
        for(int i = 0 ; i<nums.length;++i){
            nums[i] = stack.pop();
        }
        for(Integer num:nums){
            System.out.println(num);
        }
    }


    public static void printStack(ListNode head){
        if(head.next != null){
            printStack(head.next);
        }
        System.out.println(head.val);
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode one = new ListNode(5);
        ListNode two = new ListNode(6);
        head.next = one;
        one.next = two;
        useStackPrint(head);
        printStack(head);
    }
}
