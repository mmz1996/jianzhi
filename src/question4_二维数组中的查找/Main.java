package question4_二维数组中的查找;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/11 14:58
 * @Created by mmz
 */
public class Main {

    public static boolean Core(int[][] arr,int tartget){
        int xlength = arr[0].length-1;
        int ylength = arr.length-1;
        int xstart = xlength;
        int ystart = 0;
        while(ystart<ylength && xstart>=0){
            if(tartget == arr[ystart][xstart]){
                return true;
            }else if(tartget > arr[ystart][xstart]){
                ystart++;
            }else{
                xstart--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int number = 20;
        System.out.println(Main.Core(arr, number));
    }
}
