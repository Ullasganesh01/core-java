package programs;
import java.util.Scanner;

public class EvenOddArray {
    static int oddCount = 0;
    static int evenCount = 0;
    static int[] evenArray;
    static int[] oddArray;
    public static void getCount(int arr[]){ 
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
    }

    public static boolean checkEvenOdd(int ele){
        if(ele % 2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void sortEvenOdd(int[] arr){
        int evenIndex =0 ;
        int oddIndex =0;
        getCount(arr);
        evenArray = new int[evenCount];
        oddArray = new int[oddCount];
        for(int i=0;i<arr.length;i++){
            if(checkEvenOdd(arr[i])){
                evenArray[evenIndex++] = arr[i];
            }
            else{
                oddArray[oddIndex++] = arr[i];
            }
        }
        if(evenArray.length > 0){
            System.out.println("Even array :");
            for(int i=0;i<evenArray.length;i++){
                System.out.print(evenArray[i] + " ");
            }
            System.out.println();
        }
        if(oddArray.length > 0){
            System.out.println("Odd array :");
            for(int i=0;i<oddArray.length;i++){
                System.out.print(oddArray[i] + " ");
            }
            System.out.println();
        }

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
        sortEvenOdd(arr);
        s.close();
    }
}
