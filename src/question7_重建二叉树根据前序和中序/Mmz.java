package question7_重建二叉树根据前序和中序;

import com.sun.org.apache.bcel.internal.generic.FMUL;

import javax.swing.*;
import java.awt.*;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 15:53
 * @Created by mmz
 */
public class Mmz {
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
    public static TreeNode Core(int[] front, int fs, int fe, int[] mid, int ms, int me) {
        if(fs >fe || ms >me){
            return null;
        }
        TreeNode root = new TreeNode(front[fs]);
        int index = 0 ;
        for(int i = 0 ;i<front.length;++i){
            if(front[fs] == mid[ms+i]){
                index = i;
                break;
            }
        }
        root.left = Core(front,fs+1,fs+index,mid,ms,ms+index-1);
        root.right = Core(front,fs+index+1,fe,mid,ms+index+1,me);
        return root;
    }
    public static void main(String[] args) {
        int[] pre =new int[]{1,2,4,7,3,5,6,8};
        int[] mid = new int[]{4,7,2,1,5,3,8,6};
        System.out.println(Core(pre,0,pre.length-1,mid,0,mid.length-1));
//        System.out.println(help(pre,0,pre.length-1,mid,0,mid.length-1));

    }
}
