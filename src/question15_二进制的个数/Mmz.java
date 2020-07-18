package question15_二进制的个数;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 1:25
 * @Created by mmz
 */
public class Mmz {
    public static int Core(int num){
        int count = 0;
        while(num != 0){
            if((num & 1) == 1){
                count++;
            }
            num = num >>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Core(9));
    }
}
