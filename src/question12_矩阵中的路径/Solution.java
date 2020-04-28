package question12_矩阵中的路径;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/8 20:15
 * @Created by mmz
 */
public class Solution {
    public static boolean findPath(char[] matrix, int row, int col,char[] str){
        //首先判断输入
        if(matrix.length == 0 || str.length == 0){
            return false;
        }
        int[][] flag =new int[row][col];
        for(int i = 0;i<row;++i){
            for(int j = 0;j<col;++j){
                if(search(matrix,row,col,i,j,str,0,flag)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean search(char[] matrix,int row,int col,int i,int j,char[] str,int index,int[][] flag){
        int target = i*col+j;
        //继续判断
        if(i<0||j<0||i>=row||j>=col||flag[i][j]==1||matrix[target]!= str[index]){
            return false;
        }
        if(index >= str.length-1){
            return true;
        }
        flag[i][j] = 1;
        if(search(matrix,row,col,i+1,j,str,index+1,flag)||
            search(matrix,row,col,i-1,j,str,index+1,flag)||
            search(matrix,row,col,i,j+1,str,index+1,flag)||
            search(matrix,row,col,i,j-1,str,index+1,flag)){
            return true;
        }
        flag[i][j] = 0;
        return false;
    }

    public static void main(String[] args) {
        char[] matrix = new char[]{'a','b','t','g','c','f','c','s','j','d','e','h'};
        System.out.println(matrix.length);
        char[] target = new char[]{'b','f','c','e'};
        System.out.println(findPath(matrix, 3, 4, target));
    }
}
