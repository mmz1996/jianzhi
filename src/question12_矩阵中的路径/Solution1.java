package question12_矩阵中的路径;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/3/31 18:05
 * @Created by mmz
 */
public class Solution1 {

    static boolean hasPath(char[][] chars,String string){
        if(string == null|| chars.length<0||chars[0].length<0||chars == null){
            return false;
        }
        char[] charstring = string.toCharArray();
        //3 0~2
        int xlength = chars.length-1;
        //4 0~3
        int ylength = chars[0].length-1;
        boolean[] visit = new boolean[(xlength+1)*(ylength+1)];
        for(boolean visits:visit){
            visits  = false;
        }
        int pathlength = 0;
        for(int i =  0;i<=xlength;++i){
            for(int j = 0 ;j<=ylength;++j){
                if(hasPathCore(chars,xlength,ylength,i,j,charstring, pathlength,visit)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean hasPathCore(char[][] chars,int xlength,int ylength,int i,int j,char[] string,int pathlength,boolean[] visit){
        if(pathlength == string.length){
            return true;
        }
        boolean hasPath = false;

        if(i>=0 &&i<=xlength && j>=0 && j<ylength && !visit[i*ylength+j] && chars[i][j] == string[pathlength]){
            pathlength++;
            visit[i*ylength+j] = true;

            hasPath =
            hasPathCore(chars,xlength,ylength,i-1,j,string,pathlength,visit)||
            hasPathCore(chars,xlength,ylength,i+1,j,string,pathlength,visit)||
            hasPathCore(chars,xlength,ylength,i,j-1,string,pathlength,visit)||
            hasPathCore(chars,xlength,ylength,i,j+1,string,pathlength,visit);

            if(!hasPath){
                pathlength--;
                visit[i*ylength+j] = false;
            }
        }
        return hasPath;
    }

    public static void main(String[] args) {
        char[][] chars = new char[][]{{'a','b','t','g'},{'c','f','c','s'},{'j','d','e','h'}};
        String string = "bfce";
        System.out.println(hasPath(chars, string));
    }
}
