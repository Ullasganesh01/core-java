package programs;
import java.util.Scanner;

public class ReverseNumber {

    public static int reverse(int num){
        int revNum = 0;
        int lDigit =0;
        while(num > 0){
            lDigit = num % 10;
            revNum = revNum * 10 + lDigit;
            num = num/10;
        }
        return revNum;
    }

    public static void checkPlaindrome(int num){
        int reversedNum = reverse(num);
        if(reversedNum == num){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("It is not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = s.nextInt();

        //int num = 4774;
        System.out.println("Reversed number : " + reverse(num));
        checkPlaindrome(num);
        s.close();

    }
}
