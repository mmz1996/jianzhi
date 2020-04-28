package question53_在排序数组中查找数字;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/29 22:07
 * @Created by mmz
 */
public class Solution {
    static int getFirstK(int[] data,int start,int end,int k){
        if(start>end){
            return -1;
        }
        int middleIndex = (start+end)/2;
        int middleData = data[middleIndex];

        if(middleData == k){
            if(middleIndex >0 && data[middleIndex-1] != k || middleIndex == 0){
                return  middleIndex;
            }else{
                end = middleIndex-1;
            }
        }else if(middleData >k){
            end = middleIndex-1;
        }else{
            start = middleIndex +1;
        }
        return getFirstK(data,start,end,k);
    }

    static int getLast(int[] data,int start,int end,int k){
        if(start > end){
            return -1;
        }
        int middleIndex = (start+end)/2;
        int middleData = data[middleIndex];

        if(middleData == k){
            if(middleIndex == end || middleIndex<data.length-1&& data[middleIndex+1]>k){
                return middleIndex;
            }else{
                start = middleIndex+1;
            }
        }else if(middleData<k){
            start = middleIndex+1;
        }else{
            end = middleIndex-1;
        }
        return getLast(data,start,end,k);
    }

    static int getNumberLength(int[] data,int k){
        int number = 0 ;
        if(data != null && data.length>0){
            int first = getFirstK(data,0,data.length-1,k);
            int last = getLast(data,0,data.length-1,k);

            number = last - first+1;
        }
        return number;
    }

    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,3,3,3,4,5};
        int k = 3;
        System.out.println(getNumberLength(data,k));
    }
}
