package programs;
import java.util.Scanner;

public class ArraySum {

    public static int sumOfArray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=s.nextInt();
        //int arr[] = {6,1,4,3,8};
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("The sum of array elements : " + sumOfArray(arr));
        s.close();
    }
}
