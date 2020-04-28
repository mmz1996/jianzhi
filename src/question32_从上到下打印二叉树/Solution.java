package question32_从上到下打印二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/27 16:25
 * @Created by mmz
 */
public class Solution {
    static class TreeNode{
        int value ;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public static void printTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            System.out.println(treeNode.value);
            if(treeNode.left !=null){
                queue.add(treeNode.left);
            }
            if(treeNode.right != null){
                queue.add(treeNode.right);
            }
        }
    }
}
