class ApolloPharmacy {
    static int index ;
    static String medicines[] = {null,null,null,null,null,null,null,null,null}; 

    public static boolean addMedicines(String medicine) {
        boolean isMedicineAdded = false;
        if(index<medicines.length){
            if(medicine != null){
                    medicines[index++] = medicine;
                    isMedicineAdded = true;
                    System.out.println("Medicine added : "+ medicine);
            }else{
                System.out.println("Cannot insert Medicine as it is null");
            }
        }
        else{
            System.out.println("There are no available slots cannot add : " + medicine);
        }
        return isMedicineAdded;
        
    }

    public static void getMedicines(){
        System.out.println("The list of available medicines are : ");
        for(int medicine=0;medicine<medicines.length;medicine++){
            String reference = medicines[medicine];
            System.out.println("\t" + reference);
        }
        System.out.println();
    }

    public static boolean updateMedicineName(String existingMedicineName, String newMedicineName) {
        boolean isUpdated = false;
        for(int index = 0; index < medicines.length; index++){
            if(medicines[index].equals(existingMedicineName)){
                medicines[index] = newMedicineName;
                isUpdated = true;
            }
        }
        if(isUpdated){
            System.out.println("Updated Medicine name: "+ existingMedicineName + " to " + newMedicineName);
        }else{
            System.out.println("No match found cannot update.");
        }
        System.out.println();
        return isUpdated;
    }
}
