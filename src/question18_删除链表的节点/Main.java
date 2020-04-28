package question18_删除链表的节点;

import java.util.List;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 19:16
 * @Created by mmz
 */
public class Main {
    static class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }


    static void Core(ListNode listNode,ListNode head){
        if(listNode.next == null){
            ListNode pre = new ListNode(-1);
            pre.next = head;
            while(pre.next != listNode){
                pre =pre.next;
            }
            pre.next = null;
        }else{
            ListNode next = listNode.next;
            listNode.next = next.next;
            listNode.val = next.val;
        }
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        head.next = two;
        two.next = three;
        three.next = four;
        Core(three,head);
        System.out.println(two.next.val);
    }
}
