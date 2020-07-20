package question44_数字序列中某一位的数字;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/20 23:27
 * @Created by mmz
 */
public class Mmz {

    static int Core(int n){
        if(n<0){
            return -1;
        }
        int digit = 1;
        while(true){
            int digitNumber =getNumber(digit);
            int countNumber =digitNumber*digit;
            if(n<countNumber){
                return digitIndex(n,digit);
            }else{
                n = n-countNumber;
                digit++;
            }
        }
    }
    static int getNumber(int i){
        if(i == 1){
            return 10;
        }
        int count = (int)Math.pow(10,i-1);
        return 9*count;
    }
    static int digitIndex(int n,int digit){
        int number = begin(digit)+n/digit;
        int index = digit- n%digit;
        for (int i = 1; i < index; i++)
            number /= 10;
        return number%10;
    }
    static int begin(int digit){
        if(digit == 1){
            return 0;
        }else{
            return (int)Math.pow(10,digit);
        }
    }
    public static void main(String[] args) {
        System.out.println(Solution.returnNumber(19));
    }
}
