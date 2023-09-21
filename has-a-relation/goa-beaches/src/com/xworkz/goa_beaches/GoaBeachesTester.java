package com.xworkz.goa_beaches;

import com.xworkz.goa_beaches.beaches.Beach;
import com.xworkz.goa_beaches.goa.Goa;

public class GoaBeachesTester {
    public static void main(String[] args) {
        Goa goa = new Goa();
        Beach beach = new Beach();
        goa.beach = beach;
    }
}
