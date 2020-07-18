package question12_矩阵中的路径;

import sun.security.x509.IPAddressName;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/18 20:02
 * @Created by mmz
 */
public class Mmz {
    public static boolean Core(char[][] chars,String target){
        if(target == null|| chars.length<0||chars[0].length<0||chars == null){
            return false;
        }
        char[] targetChar = target.toCharArray();
        int pathIndex = 0;
        int x = chars.length;
        int y = chars[0].length;
        boolean[][] flags = new boolean[x][y];
        for(int i = 0 ;i<x;i++){
            for(int j = 0 ;j<y;++j){
                flags[i][j] =false;
            }
        }
        for(int i = 0 ;i<x;i++){
            for(int j = 0 ;j<y;++j){
                if(DFS(chars,i,j,pathIndex,targetChar,flags)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean DFS(char[][] chars,int i,int j,int pathIndex,char[] target,boolean[][] flags){
       if(pathIndex == target.length){
           return true;
       }
        boolean hasPath = false;
        if(i>=0 && i<chars.length && j>=0&& j<chars[0].length && !flags[i][j] &&chars[i][j] == target[pathIndex]){
            pathIndex++;
            flags[i][j] = true;
            hasPath = DFS(chars,i+1,j,pathIndex,target,flags)||
                    DFS(chars,i-1,j,pathIndex,target,flags)||
                    DFS(chars,i,j+1,pathIndex,target,flags)||
                    DFS(chars,i,j-1,pathIndex,target,flags);
            if(!hasPath){
                flags[i][j] = false;
                pathIndex--;
            }
        }
        return hasPath;
    }
    public static void main(String[] args) {
        char[][] chars = new char[][]{{'a','b','t','g'},{'c','f','c','s'},{'j','d','e','h'}};
        String string = "bfce";
        System.out.println(Core(chars, string));
    }


}
