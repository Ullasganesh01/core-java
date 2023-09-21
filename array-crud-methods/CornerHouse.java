class CornerHouse {
    static int index ;
    static String iceCreams[] = {null,null,null,null,null,null};
    static int arr_length = iceCreams.length;  

    public static boolean addIceCreams(String iceCream) {
        boolean isIceCreamAdded = false;
        if(index < iceCreams.length){
            if(iceCream != null){
                iceCreams[index++] = iceCream;
                isIceCreamAdded = true;
                System.out.println("Ice Cream added : "+ iceCream);
            }else{
                System.out.println("Cannot add the Ice Cream as it is null");
            }
        }else{
            System.out.println("There are no available slots cannot add : " + iceCream);
        }
        System.out.println();
        
        return isIceCreamAdded;    
    }

    public static void getIceCreams(){
        System.out.println("The list of Ice Creams are : ");
        for(int iceCream=0;iceCream<arr_length;iceCream++){
           // if(iceCreams[iceCream] != null){
                String reference = iceCreams[iceCream];
                System.out.println("\t" + reference);
           // }            
        }
        System.out.println();
    }

    public static String getIcreCreamByName(String flavour){
        String iName = null;
        for(String iceCream : iceCreams){
            if(flavour.equals(iceCream)){
                iName = iceCream;
                System.out.println("Item found.");
            }
        }
        if(iName == null){
            System.out.println("Item not found.");
        }
        return iName;
    }

    public static boolean updateIceCream(String presentIceCream, String newIceCream) {
        boolean isUpdated = false;
        for(int index = 0; index < iceCreams.length; index++){
            if(iceCreams[index].equals(presentIceCream)){
                iceCreams[index] = newIceCream;
                isUpdated = true;
            }
        }
        if(isUpdated){
            System.out.println("Updated Ice Cream: "+ presentIceCream + " to " + newIceCream);
        }else{
            System.out.println("No match found cannot update.");
        }
        System.out.println();
        return isUpdated;
    }

    public static boolean dropIceCream(String iceCream){
        boolean isDropped = false;
        for(int index = 0; index < iceCreams.length; index++){
            if(iceCreams[index] == iceCream){
                iceCreams[index] = null;
                for(int j=index; j<iceCreams.length-1;j++){
                    iceCreams[j] = iceCreams[j+1];
                }
                isDropped = true;
                arr_length--;
            }
        }
        if(isDropped){
            System.out.println("Dropped Ice Cream: "+ iceCream);
        }else{
            System.out.println("No match found cannot update.");
        }
        System.out.println();
        return isDropped;

    }

    public static int deleteIceCream(String iceCream){
        int index ;
        int noOfElements = iceCreams.length;
        for(index = 0 ; index < iceCreams.length; index++){
            if(iceCreams[index].equals(iceCream)){
                System.out.println("Deleted Ice Cream : "+ iceCream);
                break;
            }
        }
        if(index < noOfElements){
            noOfElements = noOfElements -1;
            for(int newIndex = index;newIndex < noOfElements;newIndex++){
                iceCreams[newIndex] = iceCreams[newIndex+1];
            }
        }
        return noOfElements;     
    }

    public static void postDeleteGetIceCreams(int newLength){
        System.out.println("Post Deletion Ice Creams :" );
        for(int index = 0 ; index< newLength;index++){
            System.out.println("\t"+ iceCreams[index]);
        }
        System.out.println();
    }

}
