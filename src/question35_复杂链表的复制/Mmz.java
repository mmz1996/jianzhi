package question35_复杂链表的复制;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 22:53
 * @Created by mmz
 */
public class Mmz {
    static class Complist{
        public  int data;
        public Complist pNext;
        public Complist pSibling;

        public Complist(int data) {
            this.data = data;
        }
    }
    static Complist CoreCopy(Complist complist){
        if(complist == null){
            return null;
        }
        Complist temp = complist;
        while(temp.pNext != null){
            Complist clone = new Complist(temp.data);
            clone.pNext = temp.pNext;
            clone.pSibling = null;
            temp.pNext = clone;
            temp = clone.pNext;
        }
        return complist;
    }
    static Complist CoreSibling(Complist complist){
        if(complist == null){
            return null;
        }
        Complist temp = complist;
        while(temp != null){
            Complist clone = temp.pNext;
            if(temp.pSibling != null){
                clone.pSibling =temp.pSibling.pNext;
            }
            temp = clone.pNext;
        }
        return complist;
    }
    static Complist Core(Complist head){
        Complist pNode = head;
        Complist cloneHead  = null;
        Complist cloneNode = null;

        if(head != null){
            cloneHead = pNode.pNext;
            cloneNode = pNode.pNext;
            pNode.pNext = cloneNode.pNext;
            pNode = cloneNode.pNext;
        }

        while(pNode != null){
            cloneNode.pNext = pNode.pNext;
            cloneNode = cloneNode.pNext;
            pNode.pNext = cloneHead.pNext;
            pNode = cloneNode.pNext;
        }

        return cloneHead;
    }
}
