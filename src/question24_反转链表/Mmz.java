package question24_反转链表;

import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 15:18
 * @Created by mmz
 */
public class Mmz {
    static class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val;
        }
    }

    static ListNode Core(ListNode head){
        ListNode pre = null;
        ListNode now = head;
        while(now.next != null){
            ListNode next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }
        return now;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        one.next = two;
        two.next= three;
        three.next= four;
        four.next = five;
        five.next = six;
        ListNode now = Core(one);
        System.out.println(now.val);
    }
}
