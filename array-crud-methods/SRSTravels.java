class SRSTravels {
    static int index ;
    static String toursitPlaces[] = {null,null,null,null,null,null,null,null}; 

    public static boolean insertToursitPlaces(String touristPlace) {
        boolean isTouristPlaceInserted = false;
        if( index < toursitPlaces.length){
            if(touristPlace != null){
                toursitPlaces[index++] = touristPlace;
                isTouristPlaceInserted = true;
                System.out.println("Tourist Place added : "+ touristPlace);
            }else{
                System.out.println("Cannot insert Tourist Place as it is null");
            }
        }else{
            System.out.println("There are no available slots cannot add : " + touristPlace);
        }
        System.out.println();
        
        return isTouristPlaceInserted;
        
    }

    public static void readToursitPlaces(){
        System.out.println("The list of Tourist Places from Bengaluru are : ");
        for(int touristPlace=0;touristPlace<toursitPlaces.length;touristPlace++){
            String reference = toursitPlaces[touristPlace];
            System.out.println("\t" + reference);
        }
        System.out.println();
    }

    public static boolean updateTouristPlace(String existingTouristPlace, String newTouristPlace) {
        boolean isUpdated = false;
        for(int index = 0; index < toursitPlaces.length; index++){
            if(toursitPlaces[index].equals(existingTouristPlace)){
                toursitPlaces[index] = newTouristPlace;
                isUpdated = true;
            }
        }
        if(isUpdated){
            System.out.println("Updated Tourist Place: "+ existingTouristPlace + " to " + newTouristPlace);
        }else{
            System.out.println("No match found cannot update.");
        }
        System.out.println();
        return isUpdated;
    }
}
