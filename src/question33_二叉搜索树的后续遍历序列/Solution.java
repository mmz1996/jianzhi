package question33_二叉搜索树的后续遍历序列;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/27 16:57
 * @Created by mmz
 */
public class Solution {

    public boolean VerifySquenceOfBST(int[] arr){
        if(arr == null || arr.length <=0){
            return  false;
        }
        return VerifySequence(arr,0,arr.length-1);
    }

    public boolean VerifySequence(int[] arr,int start,int end){
        if(start>=end){
            return true;
        }
        int root = arr[end];
        int i = 0;
        for(;i<end;++i){
            if(arr[i]>root){
                break;
            }
        }
        int j = i;
        for(;j<end;++j){
            if(arr[j]<root){
                return  false;
            }
        }

        return VerifySequence(arr,start,i-1) && VerifySequence(arr,i,end-1);

    }
}
