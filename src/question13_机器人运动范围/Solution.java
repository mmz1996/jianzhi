package question13_机器人运动范围;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/8 22:59
 * @Created by mmz
 */
public class Solution {



    //判断机器人是否能进入坐标为（col,row）的方格
    public static boolean check(int target,int row,int col,int rows,int cols,boolean[] visit){
        if(row>=0&&row<rows&&col>=0&&col<cols&&getDigit(col)+getDigit(row)<=target&&!visit[row*cols+col]){
            return true;
        }
        return false;
    }

    public static int moving(int target,int rows,int cols,int row ,int col,boolean[] visit){
        int count = 0;
        if(check(target,row,col,rows,cols,visit)){
            visit[row*cols+col] = true;
            count = 1+moving(target,rows,cols,row+1,col,visit)+
                    moving(target,rows,cols,row-1,col,visit)+
                    moving(target,rows,cols,row,col-1,visit)+
                    moving(target,rows,cols,row,col+1,visit);
        }
        return count;
    }


    //返回一个数字的位数之和
    public static int getDigit(int num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }


    //初始化函数
    public static int move(int target,int rows,int cols){
        if(target <0 || rows<0||cols<0){
            return 0;
        }
        boolean[] visit = new boolean[rows*cols];
        for(int i =0;i<rows*cols;++i){
            visit[i] = false;
        }
        int count = moving(target,rows,cols,0,0,visit);
        return count;
    }
    public static void main(String[] args) {
        System.out.println(move(18, 40, 40));
    }
}
