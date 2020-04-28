package question26_树的子结构;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 21:58
 * @Created by mmz
 */
public class Main {
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

    static boolean Core(TreeNode root1,TreeNode root2){
        boolean result = false;
        if(root1 != null && root2 != null){
            if(root1.val == root2.val){
                result = Cores(root1,root2);
            }
            if(!result){
                result = Core(root1.right,root2);
            }
            if(!result){
                result = Core(root1.left,root2);
            }
        }
        return result;

    }

    static boolean Cores(TreeNode root1,TreeNode root2){
        boolean flag = false;
        if(root2 == null){
            return true;
        }
        if(root1 == null && root2 != null){
            return false;
        }
        if(root1.val == root2.val){
            return
            Cores(root1.right,root2.right) &&
            Cores(root1.left,root2.left);
        }else{
            return false;
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
        TreeNode b = new TreeNode(6);
        TreeNode c = new TreeNode(2);
        a.left = b;
        a.right = c;

        System.out.println(Core(one, a));
    }
}
