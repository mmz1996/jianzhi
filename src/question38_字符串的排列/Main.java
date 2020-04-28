package question38_字符串的排列;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/12 15:06
 * @Created by mmz
 */
public class Main {

    static void CoreChange(char[] chars,int index1,int index2){
        char temp = chars[index1];
        chars[index1] = chars[index2];
        chars[index2] = temp;
    }

    static void Core(char[] chars,int index,int size){
        if(index == size){
            for(int i = 0;i<size;++i){
                System.out.print(chars[i]);
            }
            System.out.println();;
        }else{
            for(int i =index;i<size;++i){
                CoreChange(chars,i,index);
                Core(chars,index+1,size);
                CoreChange(chars,i,index);
            }
        }
    }
    public static void main(String[] args) {
        char[] chars = new char[]{'a','b','c','d'};
        int size = chars.length;
        Core(chars,0,size);
    }
}
