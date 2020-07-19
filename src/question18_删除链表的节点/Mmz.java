package question18_删除链表的节点;

import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 12:54
 * @Created by mmz
 */
public class Mmz {
    static class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }
    static void Core(ListNode listNode,ListNode head){
        if(listNode == null || head == null){
            return;
        }
        if(listNode.next != null){
            ListNode next = listNode.next;
            listNode.next = next.next;
            listNode.val =next.val;
        }else{
            ListNode pre = head;
            while(pre.next.next != null){
                pre =pre.next;
            }
            pre.next = null;
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
