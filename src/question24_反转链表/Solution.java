package question24_反转链表;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/26 21:43
 * @Created by mmz
 */
public class Solution {
    static class ListNode{
        int value;
        ListNode next = null;
        ListNode(int value) {
            this.value = value;
        }
    }
    public ListNode releaseNode(ListNode head){
        if(head == null){
            return null;
        }
        ListNode preNode = null;
        ListNode nowNode =head;
        while(nowNode != null){
            ListNode nextnode = nowNode.next;
            nowNode.next = preNode;
            preNode = nowNode;
            nowNode = nextnode;
        }
        return preNode;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = forth;

        Solution test = new Solution();
        ListNode result = test.releaseNode(head);
        System.out.println(result.value);
    }
}
