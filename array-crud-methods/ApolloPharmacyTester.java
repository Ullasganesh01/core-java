class ApolloPharmacyTester {
    public static void main(String[] args) {
        ApolloPharmacy.addMedicines("Dolo 650");
        ApolloPharmacy.addMedicines("Crocin Cold");
        ApolloPharmacy.addMedicines("Calpol 650mg");
        ApolloPharmacy.addMedicines("Disprin");
        ApolloPharmacy.addMedicines("Limcee");
        ApolloPharmacy.addMedicines("Citzine");
        ApolloPharmacy.addMedicines("Amaoxi 250");
        ApolloPharmacy.addMedicines("Dolopar 650");
        ApolloPharmacy.addMedicines("Rantac 150");

        ApolloPharmacy.getMedicines();

        ApolloPharmacy.updateMedicineName("Limcee", "Limce Orange");

        ApolloPharmacy.getMedicines();
        
    }
}
