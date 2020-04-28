package question7_重建二叉树根据前序和中序;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 15:21
 * @Created by mmz
 */
public class Main {
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
    public static TreeNode Core(int[] front,int fs,int fe, int[] mid,int ms,int me){
        if(fs>fe || ms>me){
            return null;
        }
        TreeNode root = new TreeNode(front[fs]);
        int index =0;
        for(int i= 0;i<front.length;++i){
            if(front[fs] == mid[ms+i]){
                index = i;
                break;
            }
        }
        root.left = Core(front,fs+1,fs+index,mid,ms,ms+index-1);
        root.right = Core(front,fs+index+1,fe,mid,ms+index+1,me);
        return root;
    }

//    private static TreeNode help(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
//        //递归的第一步：递归终止条件，避免死循环
//        if (pStart > pEnd || iStart > iEnd) {
//            return null;
//        }
//        //重建根节点
//        TreeNode treeNode = new TreeNode(preorder[pStart]);
//        int index = 0;  //index找到根节点在中序遍历的位置
//        while (inorder[iStart + index] != preorder[pStart]) {
//            index++;
//        }
//        //重建左子树
//        treeNode.left = help(preorder, pStart + 1, pStart + index, inorder, iStart, iStart + index - 1);
//        //重建右子树
//        treeNode.right = help(preorder, pStart + index + 1, pEnd, inorder, iStart + index + 1, iEnd);
//        return treeNode;
//
//    }

    public static void main(String[] args) {
        int[] pre =new int[]{1,2,4,7,3,5,6,8};
        int[] mid = new int[]{4,7,2,1,5,3,8,6};
        System.out.println(Core(pre,0,pre.length-1,mid,0,mid.length-1));
//        System.out.println(help(pre,0,pre.length-1,mid,0,mid.length-1));

    }


}

