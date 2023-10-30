package programs;

import java.util.ArrayList;

public class PrintCapitalInString {
    public static ArrayList<Integer> returnCapitalLetterIndex(String word){
        ArrayList<Integer> indexes= new ArrayList<Integer>();
        char temp;
        for(int i=0;i<word.length();i++){
            temp=word.charAt(i);

            if(temp>=65&&temp<=90){
                indexes.add(i);
                System.out.println(temp);
            }

            // OR 

            //if(Character.isUpperCase(temp)){
            //    indexes.add(i);
            //}
        }
        return indexes;
    }
    public static void main(String[] args) {
        System.out.println(returnCapitalLetterIndex("JAva proGRams"));
    } 
}
