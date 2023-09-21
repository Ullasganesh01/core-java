class BrahminsThatteIdli{
    static int index ;
    static String availableMenu[] = {null,null,null,null,null,null,null,null,null,null}; 

    public static boolean addDish(String dishName) {
        boolean isAdded = false;
        if(index < availableMenu.length){
            if(dishName != null){
                availableMenu[index++] = dishName;
                isAdded = true;
                System.out.println("Dish added : "+ dishName);
            }else{
                System.out.println("Cannot add the dish as it is null");
            }
        }else{
            System.out.println("There are no available slots cannot add : " + dishName);
        }
        System.out.println();
        
        return isAdded;
        
    }

    public static void getMenu(){
        System.out.println("The available dishes are : ");
        for(int dish=0;dish<availableMenu.length;dish++){
            String reference = availableMenu[dish];
            System.out.println("\t" + reference);
        }
        System.out.println();
    }

    public static boolean changeDish(String existingDish, String newDish) {
        boolean isUpdated = false;
        for(int index = 0; index < availableMenu.length; index++){
            if(availableMenu[index].equals(existingDish)){
                availableMenu[index] = newDish;
                isUpdated = true;
            }
        }
        if(isUpdated){
            System.out.println("Changed Dish : "+ existingDish + " to " + newDish);
        }else{
            System.out.println("No match found cannot update.");
        }
        System.out.println();
        return isUpdated;
    }
}
