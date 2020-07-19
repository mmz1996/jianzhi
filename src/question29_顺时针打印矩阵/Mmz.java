package question29_顺时针打印矩阵;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/19 19:39
 * @Created by mmz
 */
public class Mmz {
    static void Core(int[][] numbers,int col,int row){
        if(numbers == null || col<0 || row<0){
            return;
        }
        int start = 0;
        while(col >start*2 && row > start*2){
            printCore(numbers,col,row,start);
            start++;
        }
    }
    static void printCore(int[][] numbers,int col,int row,int start){
        int endx = col-1-start;
        int endy = row-1-start;

        for(int i = start;i<=endx;++i){
            System.out.println(numbers[start][i]);
        }
        if(start < endy){
            for(int i = start+1;i<=endy;++i){
                System.out.println(numbers[i][endx]);
            }
        }

        if(start<endy && start<endx){
            for(int i = endx-1;i>=start;i--){
                System.out.println(numbers[endy][i]);
            }
        }

        if(start<endx && start<endy-1){
            for(int i = endy-1;i>=start+1;i--){
                System.out.println(numbers[i][start]);
            }
        }

    }

    public static void main(String[] args) {
        int[][] number = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Core(number,4,4);
    }
}
