package programs;
import java.util.Scanner;

class ArraySort{
    public static int[] descSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }   
        }
        return arr;
    }

    public static int[] ascSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }   
        }
        return arr;
    }

    public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
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
        System.out.println("Ascending :");
        print(ascSort(arr));
        System.out.println();
        System.out.println("Descending :");
        print(descSort(arr));
        s.close();
        
    }
}