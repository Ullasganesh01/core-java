package com.xworkz.country_pharma;

import com.xworkz.country_pharma.country.Country;
import com.xworkz.country_pharma.pharma.Pharma;

public class CountryPharmaTester {
    public static void main(String[] args) {
        Country country = new Country();
        Pharma pharma = new Pharma();
        country.pharma = pharma;
    }
}
