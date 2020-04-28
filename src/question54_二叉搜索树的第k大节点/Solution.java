package question54_二叉搜索树的第k大节点;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/29 22:22
 * @Created by mmz
 */
public class Solution {
    class TreeNode{
        int value ;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    static TreeNode getK(TreeNode treeNode,int k){
        if(treeNode == null ||k==0){
            return null;
        }
        return getKNode(treeNode, k);
    }

    static TreeNode getKNode(TreeNode treeNode ,int k){
        TreeNode head = null;
        if(treeNode.left != null){
            head = getKNode(treeNode.left,k);
        }

        if(head == null){
            if(k==1){
                head = treeNode;
            }
            k--;
        }
        if(treeNode.right != null&& head == null){
            head = getKNode(treeNode.right,k);
        }
        return head;
    }
}
