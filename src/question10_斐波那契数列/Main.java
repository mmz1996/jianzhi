package question10_斐波那契数列;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 16:05
 * @Created by mmz
 */
public class Main {
    static int Core(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int cur = 0;
        int first = 0;
        int second = 1;
        for(int i = 2;i<=n;++i){
            cur = first+ second;
            first = second;
            second = cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(Core(6));
    }
}
