package programs;

import java.util.Scanner;

public class FrequencyOfEleInArray {
    public static void frequency(int[] arr,int key){
        int frequency = 0;
        for(int i : arr){
            if(i == key){
                frequency++;
            }
        }
        System.out.println(frequency);
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
        System.out.println("Enter the element to get its frequency :");
        int key = s.nextInt();
        frequency(arr, key);
        s.close();
    }
}
