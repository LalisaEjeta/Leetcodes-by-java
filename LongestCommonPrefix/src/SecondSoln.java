import java.util.Arrays;

public class SecondSoln {
    public static String Solution(String[] str){
        Arrays.sort(str);
        String str1=str[0];
        String str2=str[str.length-1];
        int i =0;
        while(i<str.length){
            if (str1.charAt(i)==str2.charAt(i)){
                i++;
            } else {
                break;
            }
        }
        return i==0?"":str1.substring(0,i);
    }

    public static void main(String[] args) {
        String strs[]={"Lalo","Lalisa","Tola"};
        System.out.println(Solution(strs));
    }
}
