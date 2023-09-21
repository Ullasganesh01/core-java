class Karnataka {
    static String cityNames[] = {null,null,null,null,null,null,null};
    static int index;

    public static boolean addCity(String cityName) {
        boolean isAdded = false;
        if(index < cityNames.length){
            if(cityName != null){
            cityNames[index++] = cityName;
            isAdded = true;
            System.out.println("City added : "+ cityName);
            }else{
            System.out.println("City name cannot be added because it is null");
            }
        }else{
            System.out.println("There are no available slots cannot add : " + cityName);
        }
        System.out.println();
        
        return isAdded;
    }

    public static void getCities() {
        System.out.println("The list of Cities are : ");
        for(int cityIndex = 0; cityIndex<cityNames.length; cityIndex++){
            String cityName = cityNames[cityIndex];
            System.out.println("\t"+cityName);
        }
        System.out.println();
    }

    public static boolean updateCityName(String existingCityName, String newCityName) {
        boolean isUpdated = false;
        for(int index = 0; index < cityNames.length; index++){
            if(cityNames[index].equals(existingCityName)){
                cityNames[index] = newCityName;
                isUpdated = true;
            }
        }
        if(isUpdated){
            System.out.println("Updated City name: "+ existingCityName + " to " + newCityName);
        }else{
            System.out.println("No match found cannot update.");
        }
        System.out.println();
        return isUpdated;
    }
}
