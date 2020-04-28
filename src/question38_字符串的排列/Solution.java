package question38_字符串的排列;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/27 23:22
 * @Created by mmz
 */
public class Solution {
    public void changeChar(char[] chars,int index1,int index2){
        char temp = chars[index1];
        chars[index1] = chars[index2];
        chars[index2] = temp;
    }

    public void print(char[] chars,int index,int size){
        if(index == size){
            for(int i = 0;i<size;++i){
                System.out.print(chars[i]);
            }
            System.out.println();;
        }else{
            for(int i =index;i<size;++i){
                changeChar(chars,i,index);
                print(chars,index+1,size);
                changeChar(chars,i,index);
            }
        }
    }

    public static void main(String[] args) {
        char[] chars = new char[]{'a','b','c','d'};
        int size = chars.length;
        Solution solution = new Solution();
        solution.print(chars,0,size);
    }
}
