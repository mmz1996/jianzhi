package question35_复杂链表的复制;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/12 12:01
 * @Created by mmz
 */
public class Main {
    static class Complist{
        public  int data;
        public Complist pNext;
        public Complist pSibling;

        public Complist(int data) {
            this.data = data;
        }
    }

    static Complist CoreCopy(Complist head){
        if(head== null){
            return null;
        }
        Complist temp = head;
        while(temp != null){
            Complist clonenode  = new Complist(temp.data);
            clonenode.pNext =temp.pNext;
            clonenode.pSibling = null;
            temp.pNext = clonenode;
            temp =clonenode.pNext;
        }
        return head;
    }

    static Complist CoreSibiling(Complist head){
        if(head == null){
            return null;
        }
        Complist temp = head;
        while(head!= null){
            Complist clone = temp.pNext;
            if(temp.pSibling!=null){
                clone.pSibling = temp.pSibling.pNext;
            }
            temp = clone.pNext;
        }

        return head;
    }

    static Complist Core(Complist head){
        Complist pNode = head;
        Complist cloneNode =null;
        Complist cloneHead =null;
        if(head != null){
            cloneHead = pNode.pNext;
            cloneNode = pNode.pNext;
            pNode.pNext = cloneNode.pNext;
            pNode = cloneNode.pNext;
        }
        while(pNode != null){
            cloneNode.pNext = pNode.pNext;
            cloneNode = cloneNode.pNext;
            pNode.pNext = cloneNode.pNext;
            pNode = pNode.pNext;
        }
        return cloneHead;
    }

}
