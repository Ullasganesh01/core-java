package com.xworkz.bengaluru_pubs;

import com.xworkz.bengaluru_pubs.bengaluru.Bengaluru;
import com.xworkz.bengaluru_pubs.pubs.Pubs;

public class BengaluruPubsTester {
    public static void main(String[] args) {
        Bengaluru bengaluru = new Bengaluru();
        Pubs pubs = new Pubs();
        bengaluru.pubs = pubs;
    }
}
