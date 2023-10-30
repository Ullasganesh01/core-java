package programs;

import java.util.Scanner;

public class RotateAnArray {
    public static void rotate(int[] arr,int pos){
        while (pos-->0) {
            int temp = arr[arr.length-1];
            for(int i=arr.length-2;i>=0;i--){
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
        }
        for(int i : arr) {
            System.out.print(i+" ");
        }
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
        System.out.println("Enter the number of positions to be rotated : ");
        int pos = s.nextInt();
        rotate(arr, pos);
        s.close();
    }
}
