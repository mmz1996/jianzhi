package question45_把数组排成最小的数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/21 0:08
 * @Created by mmz
 */
public class Mmz {
    static int Core(int[] num){
        List<String> list = new ArrayList<>();
        for(int i = 0;i<num.length;++i){
            list.add(String.valueOf(num[i]));
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1+o2;
                String str2= o2+o1;
                return str1.compareTo(str2);
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for(String string :list){
            stringBuilder.append(string);
        }
        String stirng =stringBuilder.toString();
        return Integer.valueOf(stirng);
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1,1024,2};
        System.out.println(Core(numbers));
    }
}
