package question2_实现单例模式;

/**
 * @Classname Singleton3
 * @Description TODO
 * @Date 2020/3/30 22:24
 * @Created by mmz
 */
public class Singleton3 {
    private volatile static Singleton3 singleton3;
    private Singleton3(){

    }
    public static Singleton3 getSingleton3(){
        if(singleton3 == null){
            synchronized (Singleton3.class){
                if(singleton3 == null){
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
