package question5_替换空格;

/**
 * @Classname Solution1
 * @Description 遍历字符创使用StringBuffer
 * @Date 2020/3/7 13:27
 * @Created by mmz
 */
public class Solution1 {

    public static String replaceBlank(String str){
        //创建一个StringBuffer
        if(str == null || str.length() < 0){
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        //循环遍历添加
        for(int i = 0 ; i <str.length();++i){
            if(str.charAt(i) == ' '){
                stringBuffer.append("%20");
            }else{
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String args[]) {
        /**
         * 测试用例
         */
        String str1 = "We are happy";
        String str2 = " Wearehappy.";
        String str3 = "Wearehappy. ";
        String str4 = "We   are   happy  .";
        String str5 = "Wearehappy.";
        String str6 = "    ";
        String str7 = " ";
        String str8 = null;
        String str9 = "";
        String string = replaceBlank(str9);
        System.out.println(string);
    }

}
