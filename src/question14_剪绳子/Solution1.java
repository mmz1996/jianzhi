package question14_剪绳子;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/3/31 21:41
 * @Created by mmz
 */
public class Solution1 {

    static int cutRope(int m){
        if(m<2){
            return 0;
        }
        if(m == 2){
            return 1;
        }
        if(m == 3){
            return 2;
        }
        int[] product = new int[m+1];
        product[0] = 0;
        product[1] = 1;
        product[2] = 2;
        product[3] = 3;


        int max;
        for(int i = 4;i<=m;++i){
            max = 0;
            for(int j = 1;j<=i/2;++j){
                int productcur = product[j]*product[i-j];
                if(productcur > max){
                   max = productcur;
                }
                product[i] = max;
            }
        }
        max = product[m];
        return max;

    }

    public static void main(String[] args) {
        System.out.println(cutRope(8));
    }
}
