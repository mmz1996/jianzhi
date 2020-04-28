package question2_实现单例模式;

/**
 * @Classname Singleton2
 * @Description 饿汉式
 * @Date 2020/3/30 21:59
 * @Created by mmz
 */
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        return singleton2;
    }

    public static void main(String[] args) {
        Singleton2 single = getInstance();
        System.out.println(single);
        single = null;
        singleton2.singleton2 = null;
        System.out.println(single);
        Singleton2 single2 =getInstance();
        System.out.println(single2);
    }
}
