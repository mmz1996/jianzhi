package question27_二叉树的镜像;

import sun.reflect.generics.tree.Tree;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 22:16
 * @Created by mmz
 */
public class Main {
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

    static TreeNode Core(TreeNode old){
        if(old == null){
            return null;
        }
        TreeNode newroot  = new TreeNode(old.val);
        newroot.right =  Core(old.left);
        newroot.left = Core(old.right);
        return newroot;
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(8);
        TreeNode two = new TreeNode(6);
        TreeNode three =new TreeNode(10);
        one.right = three;
        one.left = two;

        System.out.println(Core(one));
    }
}
