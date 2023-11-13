package programs;

import java.util.Scanner;

public class FindPosOFValInArray {
    public static void findPos(int[] arr, int val){
        int sPos=-1;
        int ePos=-1;
        for(int i=0; i<arr.length; i++){
            if (arr[i] == val) {
                sPos = i;
                break;
            }
        }
        int j=1;
        for(int i=arr.length-1; i>=0; i--){
            if (arr[i] == val) {
                ePos = j;
                break;
            }
            j++;
        }
        System.out.println("Starting position : "+(sPos+1));
        System.out.println("Ending position : "+ePos);// epos = len - spos+1; --without for loop
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the length");
        int len = s.nextInt();
        int arr[] = new int[len];
        System.out.println("enter the elemnets");
        for(int i=0; i<len; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("enter the value");
        int val = s.nextInt();
        findPos(arr, val);
        s.close();
    }
}
