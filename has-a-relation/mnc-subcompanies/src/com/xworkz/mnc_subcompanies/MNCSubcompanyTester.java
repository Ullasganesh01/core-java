package com.xworkz.mnc_subcompanies;

import com.xworkz.mnc_subcompanies.mnc.MNC;
import com.xworkz.mnc_subcompanies.subcompany.SubCompany;

public class MNCSubcompanyTester {
    public static void main(String[] args) {
        SubCompany subCompany = new SubCompany();
        MNC mnc = new MNC();
        mnc.subCompany = subCompany;
    }
}
