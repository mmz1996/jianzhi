package question2_实现单例模式;

/**
 * @Classname Singleton1
 * @Description 懒汉式
 * @Date 2020/3/30 21:46
 * @Created by mmz
 */
public class Singleton1 {
    private static Singleton1 singleton1;

    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        if(singleton1 == null){
            return new Singleton1();
        }else{
            return singleton1;
        }
    }


    public static void main(String[] args) {

    }
}
