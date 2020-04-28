package question8_二叉树的下一个节点;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 15:44
 * @Created by mmz
 */
public class Main {
    public static class TreeNode{
        String val  ;
        TreeNode left;
        TreeNode right;
        TreeNode parent;
        TreeNode(TreeNode left,TreeNode right,String val){
            this.left = left;
            this.right = right;
            this.parent = null;
            this.val = val;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val='" + val + '\'' +
                    '}';
        }
    }

    public static TreeNode Core(TreeNode treeNode){
        if(treeNode == null){
            return null;
        }
        if(treeNode.right!=null){
            treeNode = treeNode.right;
            while(treeNode.left != null){
                treeNode = treeNode.left;
            }
            return treeNode;
        }
        while(treeNode.parent != null){
            TreeNode root = treeNode.parent;
            if(root.left == treeNode){
                return root;
            }
            treeNode = treeNode.parent;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode f = new TreeNode(null,null,"f");
        TreeNode g = new TreeNode(null,null,"g");
        TreeNode h = new TreeNode(null,null,"h");
        TreeNode i = new TreeNode(null,null,"i");
        TreeNode d = new TreeNode(null,null,"d");
        TreeNode e =new TreeNode(h,i,"e");
        TreeNode b= new TreeNode(d,e,"b");
        TreeNode c = new TreeNode(f,g,"c");
        TreeNode a = new TreeNode(b,c,"a");
        h.parent = e;
        i.parent = e;
        d.parent =b;
        e.parent= b;
        f.parent =c;
        g.parent= c;
        b.parent = a;
        c.parent = a;
        System.out.println(Core(g));
    }
}
