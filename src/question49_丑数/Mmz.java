package question49_丑数;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/21 23:59
 * @Created by mmz
 */
public class Mmz {
    static boolean isUgly(int number){
        while(number%2 == 0){
            number /=2;
        }
        while (number%3 == 0){
            number /= 3;
        }
        while(number%5 == 0){
            number /=5;
        }
        return (number==1)?true:false;
    }

    static int Core(int target){
        if(target <= 0){
            return -1;
        }
        int number = 1;
        int count =1;
        while(count<target){
            number++;
            if(isUgly(number)){
                count++;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        System.out.println(Core(10));
    }
}
