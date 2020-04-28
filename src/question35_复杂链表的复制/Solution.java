package question35_复杂链表的复制;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/27 18:15
 * @Created by mmz
 */
public class Solution {
    static class Complist{
        public  int data;
        public Complist pNext;
        public Complist pSibling;

        public Complist(int data) {
            this.data = data;
        }
    }
    public static void cloneNode(Complist head){
        Complist temp = head;
        while (temp!=null){
            Complist clone = new Complist(temp.data);
            clone.pNext = temp.pNext;
            clone.pSibling = null;
            temp.pNext = clone;
            temp = clone.pNext;
        }
    }
    public static void connectSbling(Complist head){
        Complist temp = head;
        while(temp!= null){
            Complist clone  = temp.pNext;
            if(temp.pSibling != null){
                clone.pSibling = temp.pSibling.pNext;
            }
            temp = clone.pNext;
        }
    }

    public static Complist ReconnectNode(Complist head){
       Complist pNode = head;
       Complist cloneNode =null;
       Complist cloneHead =null;
       if(pNode != null){
           cloneNode = cloneHead = pNode.pNext;
           pNode.pNext = cloneNode.pNext;
           pNode = pNode.pNext;
       }
       while (pNode!=null){
           cloneNode.pNext = pNode.pNext;
           cloneNode = cloneNode.pNext;
           pNode.pNext = cloneNode.pNext;
           pNode = pNode.pNext;
       }
       return cloneHead;
    }
}
