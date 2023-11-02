package programs;

public class CountOfSheepsInArray {
    public static void main(String[] args) {
        boolean[] arr = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true};
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == true) {
                count++;
            }
        } 
        System.out.println(count);   
    }
}
