package programs;

//import java.util.Arrays;
import java.util.Scanner;

public class InitialsFromName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        String[] names = name.split("\\.");
        if (names.length>0) {
            System.out.println(names[names.length - 1]);
        }
        s.close();
    }
}
