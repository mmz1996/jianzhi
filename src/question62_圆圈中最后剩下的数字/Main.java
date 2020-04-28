package question62_圆圈中最后剩下的数字;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/12 14:41
 * @Created by mmz
 */
public class Main {

    static int Core(int n ,int m){
        if(n<1||m<1){
            return -1;
        }

        int last = 0;
        for(int i = 2;i<=n;++i){
            last = (last+m)%i;
        }
        return last;
    }
}
