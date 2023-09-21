package com.xworkz.company_clients;

import com.xworkz.company_clients.clients.Clients;
import com.xworkz.company_clients.company.Company;

public class CompanyClientsTester {
    public static void main(String[] args) {
        Company company = new Company();
        Clients clients = new Clients();
        company.clients = clients;
    }
}
