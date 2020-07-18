package question13_机器人运动范围;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 20:52
 * @Created by mmz
 */
public class Mmz {
    public static int Core(int target,int x,int y){
        if(target<0|| x<0||y<0){
            return 0;
        }
        boolean[][] visit = new boolean[x][y];
        return Count(target,x,y,visit,0,0);
    }
    public static int Count(int target,int x,int y,boolean[][] visit,int i,int j){
        int count = 0 ;
        if(cheak(target,x,y,i,j,visit)){
            visit[i][j] = true;
            count = 1+Count(target,x,y,visit,i+1,j)
                    +Count(target,x,y,visit, i-1,j)
                    +Count(target,x,y,visit,i,j+1)
                    +Count(target,x,y,visit,i,j-1);
        }
        return count;
    }
    static boolean cheak(int threshold,int rows,int cols,int i ,int j,boolean[][] visit){
        if(!visit[i][j] && i>=0 &&i<rows &&j>=0 && j<cols && getDigit(i)+getDigit(j) <=threshold){
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
}
