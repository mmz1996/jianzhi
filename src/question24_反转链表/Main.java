package question24_反转链表;

import java.time.Period;
import java.util.List;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 21:15
 * @Created by mmz
 */
public class Main {
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
        if(head == null){
            return null ;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;

        }
        return pre;
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
