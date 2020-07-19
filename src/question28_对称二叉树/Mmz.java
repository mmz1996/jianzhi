package question28_对称二叉树;

import sun.reflect.generics.tree.Tree;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 18:36
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
    static boolean Core(TreeNode root){
        if(root == null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    static boolean isMirror(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val == right.val){
            return isMirror(left.left,right.right) && isMirror(left.right,right.left);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        TreeNode one = new TreeNode(8);
        TreeNode two = new TreeNode(6);
        TreeNode three =new TreeNode(6);
        one.left = two;
        one.right = three;
        System.out.println(Core(one));
    }
}
