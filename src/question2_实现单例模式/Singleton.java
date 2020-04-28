package question2_实现单例模式;

/**
 * @Classname Singleton
 * @Description 自己动手实现，
 * @Date 2020/4/11 14:22
 * @Created by mmz
 */
public class Singleton {
    private static volatile Singleton singleton;

    public Singleton() {
    }

    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
