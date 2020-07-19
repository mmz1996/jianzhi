package question38_字符串的排列;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 23:38
 * @Created by mmz
 */
public class Mmz {
    static void Core(char[] chars){
        if(chars == null || chars.length<=0){
            return;
        }
        dfs(0,chars);
    }
    static void dfs(int index,char[] chars){
        if(index == chars.length){
            System.out.println(String.valueOf(chars));
        }
        for(int i = index;i<chars.length;++i){
            swap(i,index,chars);
            dfs(index+1,chars);
            swap(i,index,chars);
        }
    }
    static  void swap(int i ,int index,char[] chars){
        char target = chars[i];
        chars[i] = chars[index];
        chars[index] = target;
    }
    public static void main(String[] args) {
        char[] chars = new char[]{'a','b','c'};
        int size = chars.length;
        Core(chars);
    }
}
