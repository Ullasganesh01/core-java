package com.xworkz.comparator_program;



public class StringToUpperOrLower {
    public static String convert(String str){
        String newStr = "";
        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if (ch>='A' && ch<='Z') {
                newStr = newStr + (char)(ch+32);
            }else if(ch>='a' && ch<='z'){
                newStr = newStr + (char)(ch-32);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(convert("XwoRkZ"));
    }
}
