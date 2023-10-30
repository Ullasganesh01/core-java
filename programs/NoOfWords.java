package programs;
import java.util.Scanner;

public class NoOfWords {
    public static int getWordCount(String s){
        if(!(s == null || s == " ")){
            int count = 1;
            for(int i=0; i<s.length()-1;i++){
                if((s.charAt(i) == ' ')&&(s.charAt(i + 1)!= ' ')){
                    count++;
                }
            }
            return count;
        }
        return 0;        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String sentence = s.nextLine();

        //String sentence = "The more you learn the more you earn";
        System.out.println("The no of words : " + getWordCount(sentence));
        s.close();

    }
}
