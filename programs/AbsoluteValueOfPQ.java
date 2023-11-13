package programs;

import java.util.Scanner;

public class AbsoluteValueOfPQ{
    public static void absoluteOp(int num){
        int len = String.valueOf(num).toCharArray().length;
        System.out.println(len);
        int[] dumNum = new int[len];
        int i=0;
        while (num!=0) {
            int rem = num%10;
            if ((rem%5 == 0 || rem%3 == 0)&&i<len-1) {
                dumNum[i++] = rem;                
            }
            num/=10;
        }
        int p=0;
        int q=0;
        for(int j : dumNum) {
            if (j>0) {
                p = p+(j*j);
                q = q+j;
            }
        }
        q = q*q;
        System.out.println("P is : " + p);
        System.out.println("Q is : " + q);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        absoluteOp(num);
        s.close();
    }
}
