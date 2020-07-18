package question8_二叉树的下一个节点;

import javafx.scene.Parent;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 16:32
 * @Created by mmz
 */
public class Mmz {
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
    public static TreeNode Core(TreeNode root){
        if (root == null){
            return null;
        }
        if(root.right != null){
            return root.right;
        }else if(root.parent == null){
            return null;
        } else if(root.parent.left == root){
            return root.parent;
        }else{
            while(root.parent != null){
                TreeNode parents = root.parent;
                if(parents.left == root){
                    return parents;
                }
                root = parents;
            }

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
        System.out.println(Core(i));
    }
}
