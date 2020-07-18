package question6_从尾到头打印链表;

import com.sun.corba.se.impl.dynamicany.DynValueBoxImpl;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 14:33
 * @Created by mmz
 */
public class Mmz {
    static class ListNode{
        int value ;
        ListNode next = null;
        ListNode(int value){
            this.value = value;
        }
    }
    public static void Core(ListNode head){
        if(head == null){
            return ;
        }
        printList(head);
    }
    public static void printList(ListNode listNode){
        if(listNode == null){
            return;
        }
        printList(listNode.next);
        System.out.println(listNode.value);
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode one = new ListNode(5);
        ListNode two = new ListNode(6);
        head.next = one;
        one.next = two;
        Core(head);
    }

}
