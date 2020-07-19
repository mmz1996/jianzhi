package question23_链表中环的入口;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 15:07
 * @Created by mmz
 */
public class Mmz {
    static class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val){
            this.val = val;
        }
        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val;
        }
    }

    static boolean Core(ListNode head){
        if(head == null || head.next == null){
            return false;
        }
        ListNode quick = head.next;
        ListNode slow = head;
        while(quick != slow){
            if(quick != null && quick.next != null){
                return false;
            }
            slow = slow.next;
            quick =quick.next.next;
        }

        return false;
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
//        six.next =three;
        System.out.println(Core(one));
    }
}
