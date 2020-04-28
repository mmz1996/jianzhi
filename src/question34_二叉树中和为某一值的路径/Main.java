package question34_二叉树中和为某一值的路径;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/12 0:18
 * @Created by mmz
 */
public class Main {
    public static class TreeNode{
        int value;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    static void Core(TreeNode treeNode,int k){
        if(treeNode == null){
            return;
        }
        List<TreeNode> list = new ArrayList<>();
        CoreFind(treeNode,k,list);
    }

    static void CoreFind(TreeNode treeNode ,int k,List<TreeNode> list){
        if(treeNode == null){
            return;
        }
        if(treeNode.right == null && treeNode.left == null){
            if(treeNode.value == k){
                System.out.println("路径开始");
                System.out.println(treeNode.value);
                int count = list.size()-1;
                while(count>=0){
                    System.out.print(" "+list.get(count).value);
                    count--;
                }
            }
        }else{
            list.add(treeNode);
            CoreFind(treeNode.left,k-treeNode.value,list);
            CoreFind(treeNode.right,k-treeNode.value,list);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(10);
        TreeNode two = new TreeNode(5);
        TreeNode three = new TreeNode(12);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(7);

        one.right = three;
        one.left = two;
        two.left = four;
        two.right = five;

        Core(one,22);
    }
}
