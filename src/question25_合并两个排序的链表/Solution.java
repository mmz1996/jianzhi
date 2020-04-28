package question25_合并两个排序的链表;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/26 21:50
 * @Created by mmz
 */
public class Solution {
    static public class ListNode{
        int value;
        ListNode next = null;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode mergeList(ListNode l1,ListNode l2){
        if (l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode head =null;
        if(l1.value <= l2.value){
            head = l1;
            l1.next = mergeList(l1.next ,l2);
        }else{
            head = l2;
            l2.next = mergeList(l1,l2.next);
        }
        return head;
    }

//    public static void main(String[] args) {
//        ListNode one = new ListNode(1);
//        ListNode two = new ListNode(2);
//        ListNode three = new ListNode(3);
//        ListNode four = new ListNode(4);
//        ListNode five = new ListNode(5);
//        ListNode six = new ListNode(6);
//        one.next = two;
//        two.next= three;
//
//        four.next = five;
//        five.next = six;
//        Core
//    }
}
