package question34_二叉树中和为某一值的路径;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 20:54
 * @Created by mmz
 */
public class Mmz {
    public static class TreeNode{
        int value;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int value) {
            this.value = value;
        }
    }
    static void Core(TreeNode root,int target){
        if(root == null){
            return;
        }
        List<TreeNode> list = new ArrayList<>();
        CoreList(root,target,list);
    }

    static void CoreList(TreeNode root ,int target,List<TreeNode> list){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(root.value == target){
                System.out.println("路径开始");
                System.out.print(root.value);
                int count = list.size()-1;
                while(count>=0){
                    System.out.println(" "+ list.get(count--).value);
                }
            }
        }else{
            list.add(root);
            CoreList(root.left,target-root.value,list);
            CoreList(root.right,target-root.value,list);
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
