package question45_把数组排成最小的数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/28 20:42
 * @Created by mmz
 */
public class Solution {
    public static String printMinNumber(int[] arr){
        //进行边界判断
        if(arr == null || arr.length<=0){
            return "";
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i:arr){
            arrayList.add(String.valueOf(i));
        }
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1+o2;
                String b = o2+o1;
                return a.compareTo(b);
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for(String string:arrayList){
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{1,1024,2,12};
        System.out.println(printMinNumber(numbers));
    }
}

