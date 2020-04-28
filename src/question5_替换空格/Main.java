package question5_替换空格;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 15:06
 * @Created by mmz
 */
public class Main {
    public static String Core(String str){
        str = str.replace(" ","%20");
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        Core("We are happy");
    }
}
