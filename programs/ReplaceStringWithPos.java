package programs;

public class ReplaceStringWithPos {
    public static String replaceString(String alphabets){
        String digits="";
        int temp=0;
        for(int i=0;i<alphabets.length();i++){
            temp=alphabets.charAt(i);
            if(temp>=97){
                temp=temp-96;
                digits=digits+temp;
            }
            else{
                temp=temp-64;
                digits=digits+temp;
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        System.out.println(replaceString("AbCdEFghIJ"));
    }
    
}
