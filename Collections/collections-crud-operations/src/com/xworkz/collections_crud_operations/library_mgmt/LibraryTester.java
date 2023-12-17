package com.xworkz.collections_crud_operations.library_mgmt;

import com.xworkz.collections_crud_operations.library_mgmt.impl.GovtLibraryImpl;

public class LibraryTester {
    public static void main(String[] args) {
        GovtLibraryImpl govtLibrary = new GovtLibraryImpl("Modi Library");
        govtLibrary.options();
    }
}
