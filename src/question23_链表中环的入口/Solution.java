package question23_链表中环的入口;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/26 17:25
 * @Created by mmz
 */
public class Solution {
    class ListNode{
        int value;
        ListNode next = null;
        ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode EntryNode(ListNode phead){
        if(phead == null){
            return null;
        }
        ListNode p1 = phead;
        ListNode p2 = phead;
        while(p1!=null &&p2!=null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                p2 = phead;
                while(p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p1;
            }

        }
        return null;
    }
}
