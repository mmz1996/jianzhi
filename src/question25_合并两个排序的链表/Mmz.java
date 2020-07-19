package question25_合并两个排序的链表;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 15:35
 * @Created by mmz
 */
public class Mmz {
    static class ListNode {
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
    static ListNode Core(ListNode head1,ListNode head2){
        if(head1 == null && head2 == null){
            return null;
        }
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        if(head1.val >head2.val){
            head2.next = Core(head1,head2.next);
            return head2;
        }else{
            head1.next = Core(head1.next,head2);
            return head1;
        }
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

        four.next = five;
        five.next = six;
        System.out.println(Core(one, four));
    }
}
