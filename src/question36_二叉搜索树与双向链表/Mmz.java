package question36_二叉搜索树与双向链表;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 23:33
 * @Created by mmz
 */
public class Mmz {
    static class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    static  TreeNode  head= null;
    static TreeNode Core(TreeNode root){
        if(root ==null){
            return null;
        }
        Core(root.right);
        if(head == null){
            head = root;
        }else{
            head.left = root;
            root.right = head;
            head = root;
        }
        Core(root.left);
        return head;
    }
}
