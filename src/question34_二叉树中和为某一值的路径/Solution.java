package question34_二叉树中和为某一值的路径;

import java.util.Stack;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/27 17:39
 * @Created by mmz
 */
public class Solution {
    public static class TreeNode{
        int value;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public static void findPath(TreeNode root ,int k){
        if(root == null){
            return;
        }
        Stack<Integer> stack = new Stack<>();
        findPathNew(root,k,stack);
    }

    public static void findPathNew(TreeNode root ,int k ,Stack<Integer> path){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(root.value == k ){
                System.out.println("路径开始");
                for(int i :path){
                    System.out.println(i+",");
                }
                System.out.println(root.value);
            }
        }else{
            path.push(root.value);
            findPathNew(root.left,k-root.value,path);
            findPathNew(root.right,k-root.value,path);
            path.pop();
        }
    }
    public static void main(String[] args) {
        TreeNode one = new TreeNode(10);
        TreeNode two = new TreeNode(5);
        TreeNode three =new TreeNode(12);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(7);

        one.right = three;
        one.left = two;
        two.left = four;
        two.right = five;

        findPath(one,22);
    }
}
