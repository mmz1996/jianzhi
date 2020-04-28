package question49_丑数;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2020/3/29 15:57
 * @Created by mmz
 */
public class Solution2 {
    public static int getUgrlyNumber(int index){
        if(index<=0){
            return 0;
        }
        int[] result =new int[index];
        result[0] =1;
        int t2=0,t3=0,t5=0;
        for(int i =1;i<index;++i){
            result[i] = Math.min(2*result[t2],Math.min(3*result[t3],5*result[t5]));
            if(result[i]%2==0){
                t2++;
            }
            if(result[i]%3==0){
                t3++;
            }
            if(result[i]%5==0){
                t5++;
            }
        }
        return result[index-1];
    }

    public static void main(String[] args) {
        System.out.println(getUgrlyNumber(10));
    }
}
