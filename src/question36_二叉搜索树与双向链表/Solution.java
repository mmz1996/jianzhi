package question36_二叉搜索树与双向链表;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/27 19:59
 * @Created by mmz
 */
public class Solution {
    public class TreeNode{
        int value;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int value) {
            this.value = value;
        }
    }
    TreeNode head = null;
    public TreeNode Convert(TreeNode root){
        if (root == null) return root;
        Convert(root.right);
        if (head == null){
            head =root;
        }else {
            head.left = root;
            root.right =head;
            head = root;
        }
        Convert(root.left);
        return head;
    }
}
