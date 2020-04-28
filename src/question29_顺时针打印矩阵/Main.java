package question29_顺时针打印矩阵;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 22:50
 * @Created by mmz
 */
public class Main {
    void PrintMatrix(int[][] numbers,int colunms,int rows){
        if(numbers == null || colunms<=0||rows<=0){
            return;
        }

        int start = 0;
        while(colunms > start*2 && rows> start *2){
            PrintMatrixInCircle(numbers,colunms,rows,start);
            ++start;
        }
    }

    void PrintMatrixInCircle(int[][] numbers,int columns,int rows,int start){
        int endx = columns-start-1;
        int endy = rows-start-1;

        for(int i = start;i<=endx;++i){
            int number = numbers[start][i];
            System.out.println(number);
        }

        if(start<endy){
            for(int i =start+1;i<=endy;++i){
                int number = numbers[i][endx];
                System.out.println(number);
            }
        }

        if(start <endx && start <endy){
            for(int i = endx-1;i>=start;--i){
                int number =numbers[endy][i];
                System.out.println(number);
            }
        }

        if(start<endx && start<endy-1){
            for(int i = endy -1;i>=start+1;--i){
                int number  = numbers[i][start];
                System.out.println(number);
            }
        }
    }
}
