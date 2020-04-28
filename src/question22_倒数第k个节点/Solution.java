package question22_倒数第k个节点;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/26 17:02
 * @Created by mmz
 */
public class Solution {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode findk(ListNode head,int k){
        if(head == null || k<0){
            return null;
        }
        ListNode first=head,second=head;
        for(int i = 0;i<k-1;i++){
            first = first.next;
            if(first == null){
                return null;
            }
        }
        while (first != null){
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
