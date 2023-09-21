package com.xworkz.engineer_branches;

public class PrimitiveCastingTester {
    public static void main(String[] args) {
       // char j = 'a';
        byte i = 125;
        short j = i;
        int k = j;
        float l = k;
        long m = k;
        double n = m;
        n = 17387327.89122d;
        long a = (long) n;
        float b = (float) a;
        int c = (int) b;
        short d = (short) c;
        byte e = (byte) d;
        System.out.println(e);

    }
}
