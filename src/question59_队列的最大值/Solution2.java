package question59_队列的最大值;

import java.util.LinkedList;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2020/3/30 13:19
 * @Created by mmz
 */
public class Solution2 {

    //首先用两个栈实现一个队列
    static int[] maxSlideWinodw(int[] arr,int length){
        //进行边界判断
        if(arr == null||arr.length<=0||length<=0||length>arr.length){
            return null;
        }

        //创建一个双向队列
        LinkedList<Integer> queue = new LinkedList<>();
        //得到数组的长度
        int n = arr.length;
        //声明一个数组来存储最大值
        int[] result = new int[n-length+1];
        int index =0;
        for(int i =0;i<n;++i){
            //先得到当前的值
            int cur = arr[i];
            while(!queue.isEmpty() && cur>arr[queue.getLast()]){
                queue.pollLast();
            }
            queue.add(i);
            if(i-queue.peek()>=length){
                queue.poll();
            }
            if(i+1>=length){
                result[index++] = arr[queue.peek()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
       int[] result =  maxSlideWinodw(new int[]{2,3,4,2,6,2,5,1},3);
        for(int i :result){
            System.out.println(i);
        }
    }

}
