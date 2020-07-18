package question5_替换空格;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 14:18
 * @Created by mmz
 */
public class Mmz {
    public static void Core(String string){
        char[] chars = string.toCharArray();
        int count = 0 ;
        for(char x:chars){
            if(x == ' '){
                count++;
            }
        }
        char[] newchar = new char[chars.length+count*2];
        int j = 0 ;
        for(int i =  0;i<chars.length;++i){
            if(chars[i] == ' '){
                newchar[j++] ='%';
                newchar[j++] ='2';
                newchar[j++] ='0';
            }else{
                newchar[j++]=chars[i];
            }
        }
        String strings = new String(newchar);
        System.out.println(strings);

    }
    public static void main(String[] args) {
        Core("We are happy  ");
    }
}
