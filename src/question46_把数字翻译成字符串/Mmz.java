package question46_把数字翻译成字符串;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/21 22:25
 * @Created by mmz
 */
public class Mmz {
    static int Core(int number){
        if(number <0){
            return 0;
        }
        return Coredfs(String.valueOf(number));
    }
    static int Coredfs(String string){
        int length = string.length();
        int[] count = new int[length];
        count[length-1] = 1;
        int counts;
        for(int i = length-2;i>=0;--i){
            counts = count[i+1];
            int digit1 = string.charAt(i)-'0';
            int digit2 = string.charAt(i+1)-'0';
            int sum = digit1*10+digit2;
            if(sum >=10 && sum<=25){
                if(i == length-2){
                    counts  +=1;
                }else if(i<length-2){
                    counts +=count[i+2];
                }
            }
            count[i] = counts;
        }
            return count[0];
    }

    public static void main(String[] args) {
        System.out.println(Core(213));
    }
}
