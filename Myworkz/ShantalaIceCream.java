class ShantalaIceCream {
    static String[] flavors = {null,null,null,null,null,null,null};
    static int arrLength = flavors.length-1;
    static int index = -1;

    public static boolean addIceCreamFlavor(String flavor){
        boolean isAdded = false;
        if(index < arrLength){
            if(flavor != null){
                ++index;
                flavors[index] = flavor;
                System.out.println("Added : " + flavor + " flavor to index " + index );
                isAdded = true;
            }else{
                System.out.println("Cannot add null value");
            }
        }else{
            System.out.println("There are no available slots cannot add : " + flavor);
        }
        System.out.println();
        return isAdded;
    
    }

    public static boolean updateIceCreamFlavor(String presentFlavor, String newFlavor){
        boolean isUpdated = false;
        int i;
        if((presentFlavor != null) && (newFlavor != null)){
            for(i=0; i <=index; i++){
                if(flavors[i].equals(presentFlavor)){
                    flavors[i] = newFlavor;
                    isUpdated =true;
                    System.out.println("Updated : " + presentFlavor + " to : " + newFlavor + " at index " + i);
                    System.out.println();
                    return isUpdated;
                }
            }
        }else{
            System.out.println("Present flavor or new flavor cannot be null");
            System.out.println();
            return isUpdated;
        }
        if(isUpdated == false){
                   System.out.println("Cannot find and update flavor : " + presentFlavor);
        }
        System.out.println();
        return isUpdated;
    }

    public static boolean deleteIceCreamFlavor(String flavor){
        boolean isDeleted = false;
        int delIndex;
        int i,j;
        if(flavor != null){
            for(i=0; i <= index; i++){
                if(flavors[i].equals(flavor)){
                    System.out.println(flavor + " found at index : " + i);
                    delIndex = i;
                    for(j=delIndex; j < index; j++){
                        flavors[j] = flavors[j+1];
                    }
                    //flavors[index] = null;
                    arrLength--;
                    index--;
                    System.out.println("Deleted flavor : " + flavor);
                    System.out.println();
                    isDeleted = true;
                    return isDeleted;
                }
            }           
        }else{
            System.out.println("Flavor cannot be null");
            System.out.println();
            return isDeleted;
        }
        if(isDeleted == false){
            System.out.println("Cannot find and delete flavor : " + flavor);
        }
        System.out.println();
        return isDeleted;
    }

    public static void getIndexValue(){
        if(index != -1){
            System.out.println("Index value is : " + index);
        }else{
            System.out.println("Minimum index value reached : " + index);
        }
        System.out.println();
        
    }

    public static void getIceCreamFlavors(){
        for (String flavor : flavors) {
            System.out.println(flavor);
        }
        System.out.println();
    }

    public static void printIceCreamFlavors(){
        int i;
        if(index >= 0){
            System.out.println("List of Ice Cream Flavors : ");
            for(i=0; i <= index; i++){
                System.out.println("\t" + flavors[i]);
            }
        }else{
            System.out.println("There is no list");
        }
        System.out.println();
    }

    public static void printIceCreamFlavors(String flavor){
        if(flavor != null){
            String iceCream = null;
            int i;
            for(i=0; i <= index ;i++){
                if(flavor.equals(flavors[i])){
                    iceCream = flavor;
                    System.out.println(iceCream + " Ice Cream flavor found at index : " + i);
                }else if(iceCream == null){
                    System.out.println("Flavor not found while searching");
                }
            }
        }else{
            System.out.println("Flavor cannot be null");
        }
        System.out.println();
    }
}
