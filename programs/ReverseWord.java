package programs;
import java.util.Scanner;

public class ReverseWord {
    public static String reverseWord(String word){
        char[] w = new char[word.length()];
        int index =0;
        for(int i=word.length()-1; i>=0; i--){
            w[index++] = word.charAt(i);
        }
        return new String(w);
    }

    public static void exchangeWord(String sentence,String word){
        String[] senWords = sentence.split(" ");
        int count =0 ;
        for(int i=0;i<senWords.length;i++){
            if(senWords[i].equals(word)){
                senWords[i] = reverseWord(word);
                count++;

            }
        }
        if(count >0){
            String newSen = "";
            for(String s : senWords){
                newSen = newSen + s + " ";
            }
            System.out.println("New sentence : " + newSen);
        }
        else{
            System.out.println("The sentence is not modified"); 
        } 
         
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String sentence = s.nextLine();
        System.out.println("Enter the word : ");
        String word = s.next();
        //String word = "more";
        //String sentence = "The more you learn the more you earn";
        exchangeWord(sentence, word);
        s.close();

    }
}
