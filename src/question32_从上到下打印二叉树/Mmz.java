package question32_从上到下打印二叉树;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 20:25
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

    static void Core(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
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
