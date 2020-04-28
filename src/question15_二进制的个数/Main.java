package question15_二进制的个数;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 17:24
 * @Created by mmz
 */
public class Main {
    static int Core(int num){
        int count = 0;
        while(num!=0){
            if((num &1) ==1){
                count++;
            }
            num = num>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Core(9));
    }
}
