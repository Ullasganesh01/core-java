package programs;

import java.util.Scanner;

public class CheckStringRotation {
    public static void stringRotation(String str1, String str2){
        String str = str1 + str2;
        if (str.contains(str2)) {
            System.out.println("It is a rotation");
        }else{
            System.out.println("It is not a rotation");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        stringRotation(str1, str2);
        s.close();
    }
}
