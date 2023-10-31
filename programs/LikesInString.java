package programs;

import java.util.Scanner;

public class LikesInString {
    public static void printLikes(String[] arr,int size){
        if (size == 0) {
            System.out.println("no one likes this");
        }else {
            if (size>3) {
                System.out.println(arr[0]+", "+arr[1]+" and "+(size-2)+" others like this");
            }else if(size == 3){
                System.out.println(arr[0]+", "+arr[1]+" and "+arr[2]+" like this");
            }else if(size == 2){
                System.out.println(arr[0]+" and "+arr[1]+" like this");
            }else{
                System.out.println(arr[0]+" like this");
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        String arr[] = new String[size];
        for(int i = 0; i < size; i++){
            arr[i] = s.next();
        }
        printLikes(arr, size);
        s.close();
    }
}
