package question17_打印从1到最大的n位数;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 12:19
 * @Created by mmz
 */
public class Mmz {
    static void Core(int num){
        char[] chars = new char[num+1];
        for(int i = 0;i<num+1;++i){
            chars[i] = '0';
        }
        while(!Coreadd(chars)){
            Coreprint(chars);
        }
    }
    static boolean Coreadd(char[] chars){
        int flag = 0;
        for(int i = chars.length-1;i>=0;--i){
            int sum = 0 ;
            sum = flag + chars[i] -'0';
            if(i == chars.length-1){
                sum++;
            }
            if(sum >=10){
                if(i == 1){
                    chars[0] = '1';
                    break;
                }
                flag =1;
                chars[i] = (char)(sum-10+48);
            }else {
                flag = 0;
                chars[i] = (char)(sum+48);
            }
        }
        return chars[0] == '1';
    }
    static void Coreprint(char[] chars){
        boolean flag = true;
        for(int i = 0 ;i<chars.length;++i){
            if(flag && chars[i] != '0'){
                flag = false;
            }
            if(!flag && i == chars.length-1){
                System.out.println(chars[i]);
                break;
            }
            if(!flag){
                System.out.print(chars[i]);
            }
        }
    }

    public static void main(String[] args) {
        Core(4);
    }
}
