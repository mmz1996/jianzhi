package question8_二叉树的下一个节点;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/3/31 16:24
 * @Created by mmz
 */
public class Solution1 {
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

    static TreeNode getNextTreeNode(TreeNode treeNode){

        if(treeNode == null){
            return null;
        }
        TreeNode treeTarget = null;
        if(treeNode.right != null){
            treeTarget = treeNode.right;
            while(treeTarget.left != null){
                treeTarget = treeTarget.left;
            }
            return  treeTarget;
        }else if(treeNode.parent.left == treeNode){
            return treeNode.parent;
        }else if(treeNode.parent.right == treeNode){
            while (treeNode.parent != null){
                if(treeNode.parent.left == treeNode){
                    return treeNode.parent;
                }
                treeNode = treeNode.parent;
            }
            return null;
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
        System.out.println(getNextTreeNode(f));
    }
}
