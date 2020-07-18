package question2_实现单例模式;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 0:27
 * @Created by mmz
 */
public class Mmz {
    private static volatile  Mmz mmz;
    private Mmz(){

    }
    public static Mmz getMmz(){
        if(mmz == null){
            synchronized (Mmz.class){
                if(mmz == null){
                    mmz = new Mmz();
                }
            }
        }
        return mmz;
    }
}
