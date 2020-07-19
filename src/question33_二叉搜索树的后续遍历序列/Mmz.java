package question33_二叉搜索树的后续遍历序列;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 20:40
 * @Created by mmz
 */
public class Mmz {
    static boolean Core(int[] num,int length){
        if(num == null || length<=0){
            return false;
        }
        int root = num[length-1];
        int i = 0;
        for(;i<length-1;++i){
            if(num[i] >root){
                break;
            }
        }
        int j = i;
        for(;j<length-1;++j){
            if(num[j] <root){
                return false;
            }
        }
        boolean left = true;
        if(i >0){
            left = Core(num,i);
        }

        boolean right = true;
        if(j<length-1){
            right = Core(num,length-i-1);
        }
        return (left && right);
    }
    public static void main(String[] args) {
        int[] arr=  new int[]{5,7,6,9,11,10,8};
        int[] arr1= new int[]{7,4,6,5};
        System.out.println(Core(arr, arr.length));
        System.out.println(Core(arr1, arr1.length));

    }
}
