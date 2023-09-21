class PurpleLaneMetro {
    static int index ;
    static String metroStations[] = {null,null,null,null,null,null,null}; 

    public static boolean addMetroStations(String metroStation) {
        boolean isMetroStationAdded = false;
        if(index < metroStations.length){
            if(metroStation != null){
                metroStations[index++] = metroStation;
                isMetroStationAdded = true;
                 System.out.println("Station added : "+ metroStation);
            }else{
                System.out.println("Cannot add Metro Station as it is null");
            }
        }else{
            System.out.println("There are no available slots cannot add : " + metroStation);
        }
        System.out.println();
        
        return isMetroStationAdded;
        
    }

    public static void getMetroStations(){
        System.out.println("The list of Metro Stations on Purple Lane are : ");
        for(int metroStation=0;metroStation<metroStations.length;metroStation++){
            String reference = metroStations[metroStation];
            System.out.println("\t" + reference);
        }
    }

    public static boolean updateMetroStation(String existingMetroStation, String newMetroStation) {
        boolean isUpdated = false;
        for(int index = 0; index < metroStations.length; index++){
            if(metroStations[index].equals(existingMetroStation)){
                metroStations[index] = newMetroStation;
                isUpdated = true;
            }
        }
        if(isUpdated){
            System.out.println("Updated Metro Station: "+ existingMetroStation + " to " + newMetroStation);
        }else{
            System.out.println("No match found cannot update.");
        }
        System.out.println();
        return isUpdated;
    }
}
