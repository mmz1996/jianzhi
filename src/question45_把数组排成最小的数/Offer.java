package question45_把数组排成最小的数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Classname Offer
 * @Description TODO
 * @Date 2020/3/28 20:27
 * @Created by mmz
 */
public class Offer {
    public static String PrintMinNumber(int [] numbers) {
        if(numbers.length == 0)
            return "";
        ArrayList<String> arrayList= new ArrayList<>();
        for(int j = 0; j < numbers.length; j++){
            arrayList.add(String.valueOf(numbers[j]));
        }
        Collections.sort(arrayList, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                String str1 = s1 + s2;
                String str2 = s2 + s1;
                return str1.compareTo(str2);
            }
        });
        StringBuilder s  = new StringBuilder();
        for(String str : arrayList){
            s.append(str);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1,1024,2};
        System.out.println(PrintMinNumber(numbers));
    }

}
