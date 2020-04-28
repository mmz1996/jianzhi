package question7_重建二叉树根据前序和中序;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2020/3/31 15:28
 * @Created by mmz
 */
public class Solution2 {
    static class TreeNode{
        int root;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int root) {
            this.root = root;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "root=" + root +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    static TreeNode rebuildTree(int[] front,int frontstart,int frontend,int[] middle,int middlestart,int middleend){
        if(frontstart>frontend ||middlestart>middleend){
            return null;
        }
        TreeNode root = new TreeNode(front[frontstart]);
        int index = 0;
        for(int i = middlestart;i<=middleend;++i){
            if(front[frontstart] == middle[i]){
                index = i;
                break;
            }
        }
        root.left = rebuildTree(front,frontstart+1,frontstart+index-middlestart,middle,middlestart,index-1);
        root.right = rebuildTree(front,frontstart+index+1,frontend,middle,index+1,middleend);
        return root;
    }

    public static void main(String[] args) {
        int[] pre =new int[]{1,2,4,7,3,5,6,8};
        int[] mid = new int[]{4,7,2,1,5,3,8,6};
        System.out.println(rebuildTree(pre,0,pre.length-1, mid,0,mid.length-1));
    }
}
