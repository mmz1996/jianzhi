package question7_重建二叉树根据前序和中序;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/3/7 20:44
 * @Created by mmz
 */
public class Solution1 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val ;
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
    public static TreeNode reConstructBinary(int[] pre,int[] mid){
        if(pre.length <0 || mid.length < 0){
            return null;
        }
        return ConstructBinaryTree(pre,0,pre.length-1,mid,0,mid.length-1);
    }
    public static TreeNode ConstructBinaryTree(int[] pre,int ps,int pe,int[] mid, int ms,int me){
        if(ps >pe || ms >me){
            return null;
        }
        TreeNode root = new TreeNode(pre[ps]);
        for(int i = ms;i<=me;++i){
            if(pre[ps] == mid[i]){
                root.left = ConstructBinaryTree(pre,ps+1,ps+i,mid,ms,i-1);
                root.right = ConstructBinaryTree(pre,ps+i+1,pe,mid,i+1,me);
                break;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[] pre =new int[]{1,2,4,7,3,5,6,8};
        int[] mid = new int[]{4,7,2,1,5,3,8,6};
        System.out.println(reConstructBinary(pre, mid));
    }
}
