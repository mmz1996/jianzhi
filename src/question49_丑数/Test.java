package question49_丑数;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/7/22 0:06
 * @Created by mmz
 */
public class Test {
    static int Core(int target){
        if(target <=0){
            return 0;
        }
        int[] index = new int[target];
        index[0] =1;
        int t2=0,t3=0,t5=0;
        for(int i = 1 ;i<target;++i){
            index[i] = Math.min(2*index[t2],Math.min(3*index[t3],5*index[t5]));
            if(index[i] % 2== 0){
                t2++;
            }
            if(index[i] % 3== 0){
                t3++;
            }
            if(index[i] % 5 ==0){
                t5++;
            }
        }
        return index[target-1];
    }
    public static void main(String[] args) {
        System.out.println(Core(10));
    }
}
