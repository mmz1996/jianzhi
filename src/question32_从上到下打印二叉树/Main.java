package question32_从上到下打印二叉树;

import question28_对称二叉树.MaIn;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 23:25
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

    static void Core(TreeNode root){
        Queue<TreeNode> queue  = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode now = queue.remove();
            System.out.println(now.val);
            if(now.left!= null){
                queue.add(now.left);
            }
            if(now.right != null){
                queue.add(now.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(8);
        TreeNode two = new TreeNode(8);
        TreeNode three = new TreeNode(7);
        TreeNode four = new TreeNode(9);
        TreeNode five = new TreeNode(2);
        TreeNode six = new TreeNode(4);
        TreeNode seven = new TreeNode(7);

        one.right = three;
        one.left = two;
        two.left = four;
        two.right = five;
        five.left = six;
        five.right = seven;

        Core(one);
    }
}
