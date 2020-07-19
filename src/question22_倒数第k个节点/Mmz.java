package question22_倒数第k个节点;

import question10_斐波那契数列.Frog;

import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 15:04
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
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    static ListNode Core(ListNode head,int k){
        if(head == null){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        while(k !=0 ){
            first = first.next;
            k--;
        }
        while(first.next != null){
            first = first.next;
            second = second.next;
        }
        return second;
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

        System.out.println(Core(one, 2));
    }
}
