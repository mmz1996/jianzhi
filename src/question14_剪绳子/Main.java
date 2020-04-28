package question14_剪绳子;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 17:04
 * @Created by mmz
 */
public class Main {
    static int Core(int length){
        if(length <2){
            return 0;
        }
        if(length ==2 ){
            return 1;
        }
        if(length == 3){
            return 2;
        }
        int[] lengths = new int[length+1];
        lengths[1] = 1;
        lengths[2] = 2;
        lengths[3] = 3;
        for(int i = 4;i<=length;++i){
            int max = 0;
            for(int j = 1;j<=i/2;++j){
                int cur = lengths[j]*lengths[i-j];
                if(cur>max){
                    max = cur;
                }
            }
            lengths[i] = max;
        }
        return lengths[length];
    }

    public static void main(String[] args) {
        System.out.println(Core(8));
    }
}
