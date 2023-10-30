package programs;
public class XBoxPattern {
    public static void main(String[] args) {

        System.out.println("Pattern one : \n");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if((i==1&&j==1) ||(i==1&&j==5) || (i==5&&j==1) || (i==5&&j==5) || (i==3&&j==3)){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern two : \n");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if((i==1&&j==1) ||(i==1&&j==4) || (i==4&&j==1) || (i==4&&j==4)){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
