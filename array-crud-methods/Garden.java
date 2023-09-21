class Garden {
    static int index ;
    static String flowerPlants[] = {null,null,null,null,null}; 

    public static boolean plantFlowerPlants(String flowerPlant) {
        boolean isPlanted = false;
        if(index < flowerPlants.length){
            if(flowerPlant != null){
                flowerPlants[index++] = flowerPlant;
                isPlanted = true;
                System.out.println("Flower Plant planted : "+ flowerPlant);
            }else{
                System.out.println("Cannot plant the flower plant as it is null");
            }
        }else{
            System.out.println("There are no available slots cannot plant : " + flowerPlant);
        }
        System.out.println();
        
        return isPlanted;    
    }

    public static void getFlowerPlants(){
        System.out.println("The available flower plants are : ");
        for(int plant=0;plant<flowerPlants.length;plant++){
            String reference = flowerPlants[plant];
            System.out.println("\t" + reference);
        }
        System.out.println();
    }

    public static boolean changeFlowerPlant(String presentFlowerPlant, String newFlowerPlant) {
        boolean isUpdated = false;
        for(int index = 0; index < flowerPlants.length; index++){
            if(flowerPlants[index].equals(presentFlowerPlant)){
                flowerPlants[index] = newFlowerPlant;
                isUpdated = true;
            }
        }
        if(isUpdated){
            System.out.println("Changed Flower Plant: "+ presentFlowerPlant + " to " + newFlowerPlant);
        }else{
            System.out.println("No match found cannot update.");
        }
        System.out.println();
        return isUpdated;
    }
}
