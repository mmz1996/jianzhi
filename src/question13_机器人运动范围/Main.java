package question13_机器人运动范围;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 16:47
 * @Created by mmz
 */
public class Main {

    static int Moving(int threshold,int rows,int cols){
        if(threshold<0|| rows<0||cols<0){
            return 0;
        }
        boolean[] visit = new boolean[rows*cols];

        int count =  Core(threshold,rows,cols,0,0,visit);
        return count;
    }

    static int Core(int threshold,int rows,int cols,int i ,int j,boolean[] visit){
        int count = 0;
        if(cheak(threshold,rows,cols,i,j,visit)){
            visit[j*rows+i] = true;
            count = 1+Core(threshold,rows,cols,i+1,j,visit)
                    +Core(threshold,rows,cols,i-1,j,visit)
                    +Core(threshold,rows,cols,i,j+1,visit)
                    +Core(threshold,rows,cols,i,j-1,visit);
        }
        return count;
    }
    static boolean cheak(int threshold,int rows,int cols,int i ,int j,boolean[] visit){
        if(!visit[j*rows+i] && i>=0 &&i<rows &&j>=0 && j<cols && getDigit(i)+getDigit(j) <=threshold){
            return true;
        }
        return false;
    }

    static int getDigit(int i){
        int sum = 0;
        while(i>0){
            sum += i%10;
            i /=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Moving(18, 40, 40));
    }
}
