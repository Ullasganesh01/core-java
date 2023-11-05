package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void checkAnagrams(String str1, String str2){
        char[] chars1;
        char[] chars2;
        String dummy1 = "";
        String dummy2 = "";
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            if ((ch >='A' && ch <='Z')||(ch >='a' && ch <='z')){
                dummy1 += ch; 
            }
        }
        for(int i = 0; i < str2.length(); i++){
            char ch = str2.charAt(i);
            if ((ch >='A' && ch <='Z')||(ch >='a' && ch <='z')){
                dummy2 += ch; 
            }
        }
        if (dummy1.length() == dummy2.length()) {
            chars1 = dummy1.toCharArray();
            chars2 = dummy2.toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            if (Arrays.equals(chars1, chars2)) {
                System.out.println("Anagrams");
            }else{
                System.out.println("Not Anagrams");
            }
        }else{
            System.out.println("Not Anagrams");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        checkAnagrams(str1, str2);
        s.close();
    }
}
