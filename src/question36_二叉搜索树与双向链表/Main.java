package question36_二叉搜索树与双向链表;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/12 14:47
 * @Created by mmz
 */
public class Main {
    static class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    static  TreeNode  head= null;
    static TreeNode Core(TreeNode root){
        if(root == null){
            return null;
        }
        Core(root.right);
        if(head == null){
            head = root;
        }else{
            head.left = root;
            root.right = head;
            head = root;
        }
        Core(root.left);
        return head;
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(10);
        TreeNode two = new TreeNode(6);
        TreeNode three = new TreeNode(14);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(8);
        TreeNode six = new TreeNode(12);
        TreeNode seven = new TreeNode(16);
        one.right = three;
        one.left = two;
        two.left =four;
        two.right = five;
        three.left = six;
        three.right = seven;

        System.out.println(Core(one).val);
    }
}
