package question11_旋转数组最小的数字;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 18:47
 * @Created by mmz
 */
public class Mmz {
    public static int Core(int[] num){
        if(num == null){
            return -1;
        }
        int start = 0;
        int end = num.length-1;
        while(start <end){
            int mid = (start+end)/2;
            if(num[mid] >num[start]){
                start = mid;
            }else{
                end = mid;
            }
        }
        return num[end+1];
    }

    public static void main(String[] args) {
        System.out.println(Core(new int[]{7,1,2,3,4,5,6}));
    }
}
