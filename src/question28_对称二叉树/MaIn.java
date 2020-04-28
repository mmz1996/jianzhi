package question28_对称二叉树;

import sun.reflect.generics.tree.Tree;

/**
 * @Classname MaIn
 * @Description TODO
 * @Date 2020/4/11 22:37
 * @Created by mmz
 */
public class MaIn {
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
            return false;
        }
        return CoreMirror(root.left,root.right);
    }

    static boolean CoreMirror(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left != null && right == null){
            return false;
        }
        if(left == null && right != null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return CoreMirror(left.left,right.right)&&CoreMirror(left.right,right.left);
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(8);
        TreeNode two = new TreeNode(6);
        TreeNode three =new TreeNode(7);
        one.left = two;
        one.right = three;
        System.out.println(Core(one));
    }
}
