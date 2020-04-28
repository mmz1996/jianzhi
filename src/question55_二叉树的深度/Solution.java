package question55_二叉树的深度;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/29 23:37
 * @Created by mmz
 */
public class Solution {
    class TreeNode{
        int value ;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int value) {
            this.value = value;
        }
    }
    static int getDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int right = getDepth(root.right);
        int left = getDepth(root.left);

        return right>left?(right+1):(left+1);
    }
}
