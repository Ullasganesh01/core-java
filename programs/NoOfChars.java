package programs;
import java.util.Scanner;

public class NoOfChars {

    public static int getCharCount(String s){
        int count = 0 ;
        for(int i=0; i<s.length(); i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String sentence = s.nextLine();

        //String sentence = "The more you learn the more you earn";
        System.out.println("The no of characters : " + getCharCount(sentence));
        s.close();

    }
}
