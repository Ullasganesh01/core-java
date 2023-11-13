package programs;

import java.util.Scanner;

public class Merge2Arrays {

    public static void mergeInArrayOrder(int[] arr1, int[] arr2,int[] merge){
        int k=0;
        for(int i = 0; i < arr1.length;i++){
            merge[k++] = arr1[i];
        }
        for(int i = 0; i < arr2.length;i++){
            merge[k++] = arr2[i];
        }
        for(int i : merge){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void mergeAscendingOrderBasedOnEle(int[] arr1, int[] arr2,int[] merge){
        int k=0;
        int i=0;
        int j=0;
        while (k<merge.length&&i<arr1.length&&j<arr2.length){
            if (arr1[i]<arr2[j]) {
                merge[k] = arr1[i];
                i++;
            }else{
                merge[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (k<merge.length&&i<arr1.length) {
            merge[k]=arr1[i];
            i++;
            k++;
        }
        while (k<merge.length&&i<arr2.length) {
            merge[k]=arr2[j];
            j++;
            k++;
        }
        for(int x : merge){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the 1st array length");
        int len1 = s.nextInt();
        int arr1[] = new int[len1];
        System.out.println("enter the elements");
        for(int i =0; i < len1; i++){
            arr1[i] = s.nextInt();
        }
        System.out.println("enter the 2nd array length");
        int len2 = s.nextInt();
        int arr2[] = new int[len2];
        System.out.println("enter the elements");
        for(int i =0; i < len2; i++){
            arr2[i] = s.nextInt();
        }
        int merge[] = new int[len1 + len2];
        mergeInArrayOrder(arr1, arr2,merge);
        System.out.println();
        mergeAscendingOrderBasedOnEle(arr1, arr2, merge);
        s.close();
    }
}
