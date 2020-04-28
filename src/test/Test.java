package test;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/3/9 14:38
 * @Created by mmz
 */
public class Test {
    public static boolean test(int[] number){
        for(int i=0;i<number.length;i++){
            number[i] +=1;
        }
        return number[0] == 1;
    }

    public static void main(String[] args) {
        int[] number = new int[]{1,2,3,4,5};
        while(!test(number)){
            for(int i = 0;i<number.length;++i){
                System.out.println(number[i]);
            }
        }
    }
}
