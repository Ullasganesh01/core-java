package com.xworkz.library_mgmt;

import com.xworkz.library_mgmt.impl.GovtLibraryImpl;

public class LibraryTester {
    public static void main(String[] args) {
        GovtLibraryImpl govtLibrary = new GovtLibraryImpl("Modi Library");
        govtLibrary.options();
    }
}
