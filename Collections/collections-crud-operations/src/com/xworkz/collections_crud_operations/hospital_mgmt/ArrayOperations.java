package com.xworkz.collections_crud_operations.hospital_mgmt;

import com.xworkz.collections_crud_operations.ecom_mgmt.dto.CustomerDTO;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    Scanner sc = new Scanner(System.in);
    int size;
    int index;
    int arr1[] = new int[0];
    int totalSize;
    public void initialize(){
        System.out.println("Enter the length of the array");
        size = sc.nextInt();
        arr1 = new int[size];
        for (int i=0; i<size;i++){
            arr1[i] = sc.nextInt();
            index++;
        }
    }

    public void addEle(){
        System.out.println("Enter the number of elements to be created : ");
        int s = sc.nextInt();
        totalSize = size + s;
        arr1 = Arrays.copyOf(arr1,totalSize);
        for (int i = size; i < totalSize;i++){
            arr1[i] = sc.nextInt();
            size++;
            index++;
        }
    }

    public void getArray(){
        if (index>=0){
            for (int i=0;i<index;i++){
                System.out.print(arr1[i]);
            }
            System.out.println();
        }
    }

    public void print(){
        for (int i : arr1){
            System.out.print(i);
        }
        System.out.println();
    }

    public void deleteItem(int key){
        //boolean isDeleted = false;
        int newIndex=0;
        if (key >0){
            for (int i=0;i<index;i++){
                if(!(arr1[i] == key)){
                    arr1[newIndex++] = arr1[i];
                }
            }
            size--;
            index--;
            arr1 = Arrays.copyOf(arr1,arr1.length-1);
            System.out.println(Arrays.toString(arr1));
        }
    }


    public static void main(String[] args) {
/*
        ArrayOperations arrayOperation = new ArrayOperations();
        arrayOperations.initialize();
        System.out.println();
        arrayOperations.getArray();
        System.out.println();
        arrayOperations.deleteItem(3);
        System.out.println();
        arrayOperations.getArray();
        System.out.println();
        arrayOperations.print();
        System.out.println();
        arrayOperations.deleteItem(7);
        System.out.println();
        arrayOperations.getArray();
        System.out.println();
        arrayOperations.print();
        System.out.println();
        arrayOperations.deleteItem(2);
        System.out.println();
        arrayOperations.getArray();
        System.out.println();
        arrayOperations.print();
        System.out.println();
        arrayOperations.deleteItem(1);
        System.out.println();
        arrayOperations.getArray();
        System.out.println();
        arrayOperations.print();
        System.out.println();
        arrayOperations.deleteItem(5);
        System.out.println();
        arrayOperations.getArray();
        System.out.println();
        arrayOperations.print();

 */
        /*
        int arr[] = new int[]{2,5,3,8,10,6};
        System.out.println(arr.length);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.stream(arr1));
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.binarySearch(arr,3));
         */
        /*
        int arr[] = new int[0];
        System.out.println(Arrays.toString(arr));
        arr = Arrays.copyOf(arr,2);
        System.out.println(Arrays.toString(arr));
         */
        /*
        ArrayOperations a = new ArrayOperations();
        a.addEle();
        a.print();
        a.getArray();
        a.addEle();
        a.print();
        a.deleteItem(5);
        a.print();
        a.getArray();
        a.addEle();
        a.print();
         */
        Scanner s = new Scanner(System.in);
        String sc = s.nextLine();
        System.out.println(sc);

    }
}
