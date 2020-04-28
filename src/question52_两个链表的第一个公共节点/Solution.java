package question52_两个链表的第一个公共节点;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/29 16:25
 * @Created by mmz
 */
public class Solution {
    static class ListNode{
        int value;
        ListNode next = null;

        public ListNode(int value) {
            this.value = value;
        }
    }

    static ListNode firstPublicListNode(ListNode head1,ListNode head2){
        if(head1 == null && head2 == null){
            return null;
        }
        int m =1;
        int n =1;
        ListNode LongList;

        ListNode ShortList;
        while(head1!=null){
            head1 = head1.next;
            m++;
        }
        while(head2!= null){
            head2 = head2.next;
            n++;
        }
        int length = 0;
        if(m>n){
            LongList = head1;
            ShortList = head2;
            length = m-n;
        }else{
            LongList = head2;
            ShortList = head1;
            length = n-m;
        }
        for(int i = 0;i<length;++i){
            LongList = LongList.next;
        }

        while(LongList !=null && ShortList !=null && LongList.value != ShortList.value){
            LongList =LongList.next;
            ShortList=ShortList.next;
        }

        ListNode resultNode = LongList;
        return resultNode;
    }
}
