package question22_倒数第k个节点;

import java.util.List;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 20:50
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
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    static ListNode Core(ListNode listNode ,int k){
        if(listNode == null || k <=0){
            return null;
        }
        ListNode pre = listNode;
        ListNode last = listNode;
        for(int i = 0;i<k-1;++i){
            if(pre.next != null){
                pre = pre.next;
            }else{
                return null;
            }
        }
        while(pre.next != null){
            last = last.next;
            pre = pre.next;
        }
        return last;
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
