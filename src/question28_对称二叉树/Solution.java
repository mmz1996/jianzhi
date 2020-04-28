package question28_对称二叉树;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/26 23:55
 * @Created by mmz
 */
public class Solution {
    static class TreeNode{
        int value ;
        TreeNode left =null;
        TreeNode right  = null;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public void mirrorTree(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left ==null && root.right ==null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.right != null){
            mirrorTree(root.right);
        }

        if(root.left != null){
            mirrorTree(root.left);
        }
    }
}
