package programs;

import java.util.Scanner;

public class TargetIndexes {
    public static void matchTarget(int[] arr,int target){
        int num1Index = -1;
        int num2Index = -1;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length-1; j++){
                if (arr[i]+arr[j] == target) {
                    num1Index = i;
                    num2Index = j;
                }
            }
        }
        System.out.println("["+num1Index+","+num2Index+"]");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements :");
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the target :");
        int target = s.nextInt();
        matchTarget(arr, target);
        s.close();
    }
}
