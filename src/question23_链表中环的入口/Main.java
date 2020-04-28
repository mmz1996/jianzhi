package question23_链表中环的入口;

import java.util.List;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 20:58
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
        ListNode pre = head;
        ListNode meet = Corefind(head);
        if(head == null){
            return null;
        }
        while(pre != meet){
            pre = pre.next;
            meet = meet.next;
        }
        return pre;
    }

    static ListNode Corefind(ListNode head){
        ListNode first = head;
        ListNode second = head;
        while(first.next!= null && first.next.next!= null){

            first = first.next.next;
            second = second.next;
            if(first == second){
                return first;
            }
        }
        return null;
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
        six.next =three;
        ListNode node = Core(one);
        System.out.println(node.toString());
    }
}
