package question26_树的子结构;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/26 22:23
 * @Created by mmz
 */
public class Solution {
    class TreeNode{
        int val;
        TreeNode left = null   ;
        TreeNode right =  null  ;
    }

    public boolean DoesTreeHasTree(TreeNode root1,TreeNode root2){
        if(root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        return DoesTreeHasTree(root1.right,root2.right) && DoesTreeHasTree(root1.left,root2.left);
    }

    public boolean HasSubTree(TreeNode root1,TreeNode root2){
        boolean result = false;
        if(root1 != null && root2 != null){
            if(root1.val == root2.val){
                result = DoesTreeHasTree(root1,root2);
            }
            if(!result){
                result = HasSubTree(root1.right,root2);
            }
            if(!result){
                result = HasSubTree(root1.left,root2);
            }
        }
        return result;
    }
}
