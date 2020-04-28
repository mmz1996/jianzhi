package question6_从尾到头打印链表;

import java.util.List;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 15:14
 * @Created by mmz
 */
public class Main {
    public static class ListNode{
        int val;
        ListNode next= null;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static void Core(ListNode listNode){
        if (listNode == null){
            return ;
        }
        Core(listNode.next);
        System.out.println(listNode.val);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode one = new ListNode(5);
        ListNode two = new ListNode(6);
        head.next = one;
        one.next = two;
        Main.Core(head);
    }
}
