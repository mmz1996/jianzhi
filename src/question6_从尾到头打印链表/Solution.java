package question6_从尾到头打印链表;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/31 15:06
 * @Created by mmz
 */
public class Solution {
    static class ListNode{
        int value;
        ListNode next = null;

        public ListNode(int value) {
            this.value = value;
        }
    }
    static void printListNode(ListNode head){
        if(head == null){
            return;
        }

        printListNode(head.next);
        System.out.println(head.value);

    }
    static int[] sada(){
        return new int[]{2,3};
    }

    public static void main(String[] args) {
       ListNode head = new ListNode(4);
       ListNode one = new ListNode(5);
        ListNode two = new ListNode(6);
        head.next = one;
        one.next = two;
        printListNode(head);
    }

}
