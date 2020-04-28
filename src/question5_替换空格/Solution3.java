package question5_替换空格;

/**
 * @Classname Solution3
 * @Description TODO
 * @Date 2020/3/31 14:50
 * @Created by mmz
 */
public class Solution3 {
    static String repalceBlank(String string){
        char[] chars = string.toCharArray();
        int count = 0;
        for(int i = 0;i<chars.length;++i){
            if(chars[i] == ' '){
                count++;
            }
        }
        int newlength = count*2+chars.length;
        char charnew[] = new char[newlength];
        int j = charnew.length-1;
        for(int i =chars.length-1;i>=0;--i){
            if(chars[i] != ' '){
                charnew[j--] = chars[i];
            }else{
                charnew[j--] ='0';
                charnew[j--] = '2';
                charnew[j--] = '%';
            }
        }
        return new String(charnew);
    }


    public static void main(String[] args) {
        String string = repalceBlank("We are happy.");
        System.out.println(string);
    }
}
