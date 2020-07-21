package question50_只出现一次的字符串;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/22 0:25
 * @Created by mmz
 */
public class Mmz {
    static char Core(String string){
        int[] result = new int[256];
        char[] chars = string.toCharArray();
        for(int i =0;i<chars.length;++i){
            result[chars[i]-'a']++;
        }
        for(int i = 0;i<chars.length;++i){
            if(result[chars[i]-'a'] == 1){
                return chars[i];
            }
        }
        return '0';
    }

    public static void main(String[] args) {
        System.out.println(Core("aeaccdbff"));
    }

}
