package question10_斐波那契数列;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2020/3/31 17:02
 * @Created by mmz
 */
public class Solution2 {

    static int getN(int number){
        if(number == 0 ){
            return 0;
        }
        if(number == 1){
            return 1;
        }
        return getN(number-1)+getN(number-2);
    }

    public static void main(String[] args) {
        System.out.println(getN(6));
    }
}
