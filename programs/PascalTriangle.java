package programs;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i <= n; i++){
            for(int k = n-i; k>0; k--){
                System.out.print(" ");
            }
            int m = 1;
            for(int j = 1; j <= i; j++){
               System.out.print(m+" ");
               m = m*(i-j)/j; 
            }
            System.out.println();
        }
    }
}
