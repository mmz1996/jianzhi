package question10_斐波那契数列;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 18:43
 * @Created by mmz
 */
public class Mmz {

    public static int Core(int n){
        if(n <=0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n ==2 ){
            return  2;
        }
        int f1 = 1;
        int f2 = 2;
        int result = 0;
        for(int i = 3;i<=n;++i){
            result = f1+f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Core(5));
    }
}
