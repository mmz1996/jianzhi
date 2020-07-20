package question42_连续子数组的最大和;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/20 23:09
 * @Created by mmz
 */
public class Mmz {
    static int Core(int[] num){
        if(num == null || num.length<=0){
            return -1;
        }
        int max = num[0];
        int now = num[0];
        for(int i = 1;i<num.length ;++i){
            if(now <=0){
                now = num[i];
                max = max>now?max:now;
            }else{
                now = now+num[i];
                max = Math.max(now,max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(Core(new int[]{1, -2, 3, 10, -4, 7, 2, -5}));
    }
}
