package question26_树的子结构;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 15:41
 * @Created by mmz
 */
public class Mmz {
    static class  TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
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
    static boolean Core(TreeNode A ,TreeNode B){
        if(A == null){
            return false;
        }
        if(B == null){
            return true;
        }
        boolean flag = false;
        if(CoreRoot(A, B)){
            return true;
        }else{
            return Core(A.right,B) || Core(A.left,B);
        }

    }
    static boolean CoreRoot(TreeNode A ,TreeNode B){
        if(A == null && B != null){
            return false;
        }
        if(B == null){
            return true;
        }

        if(A.val == B.val){
            return CoreRoot(A.left,B.left) && CoreRoot(A.right,B.right);
        }else{
            return  false;
        }

    }
    public static void main(String[] args) {
        TreeNode one = new TreeNode(8);
        TreeNode two = new TreeNode(8);
        TreeNode three = new TreeNode(7);
        TreeNode four = new TreeNode(9);
        TreeNode five = new TreeNode(2);
        TreeNode six = new TreeNode(4);
        TreeNode seven = new TreeNode(7);

        one.right = three;
        one.left = two;
        two.left = four;
        two.right = five;
        five.left = six;
        five.right = seven;

        TreeNode a = new TreeNode(8);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(2);
        a.left = b;
        a.right = c;

        System.out.println(Core(one, a));
    }
}
