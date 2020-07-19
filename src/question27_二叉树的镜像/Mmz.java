package question27_二叉树的镜像;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 18:30
 * @Created by mmz
 */
public class Mmz {
    static class  TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    static TreeNode Core(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode result = new TreeNode(root.val);
        result.right  =Core(root.left);
        result.left = Core(root.right);
        return result ;
    }


}
