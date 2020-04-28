package question5_替换空格;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2020/3/7 13:45
 * @Created by mmz
 */
public class Solution2 {
    public static String findBlank(char[] chars){
        int count = 0;
        for(int i = 0 ;i<chars.length ; ++i){
            if(chars[i] == ' '){
                ++count;
            }
        }
        int newlength = chars.length + count*2;
        int i = chars.length-1;
        int j = newlength -1;
        char[] c = new char[newlength];
        while(i>=0 && j>=i){
            if(chars[i] == ' '){
                c[j--] = '0';
                c[j--] = '2';
                c[j--] = '%';
            }else{
                c[j--] = chars[i];
            }
            i--;
        }
        return new String(c);
    }

    public static void main(String args[]) {
        /**
         * 测试用例
         */
        String str1 = "w e";
        String str2 = " Wearehappy.";
        String str3 = "Wearehappy. ";
        String str4 = "We   are   happy  .";
        String str5 = "Wearehappy.";
        String str6 = "    ";
        String str7 = " ";
        String str8 = null;
        String str9 = "";
        String string = findBlank(str1.toCharArray());
        System.out.println(string);
    }
}
