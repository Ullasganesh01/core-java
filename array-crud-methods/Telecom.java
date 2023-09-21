class Telecom {
    static int index;
    static String simCards[] = {null,null,null,null,null,null};

    public static boolean insertSimCard(String simcard){
        boolean isSimCardInserted = false;
        if(index < simCards.length){
            if(simcard != null){
            simCards[index++] = simcard;
            isSimCardInserted = true;
            System.out.println("Sim Card inserted : "+ simcard);
            }else{
                System.out.println("Sim Card cannot be inserted because it is null");
            }
        }else{
            System.out.println("There are no available slots cannot add : " + simcard);
        }
        System.out.println();
        
        return isSimCardInserted;
    }

    public static void getSimCards(){
        System.out.println("Available sim cards : ");
        for(String simCard : simCards){
            System.out.println("\t"+simCard);
        }
        System.out.println();
    }

    public static boolean updateSimCard(String existingSimCard, String newSimCard) {
        boolean isUpdated = false;
        for(int index = 0; index < simCards.length; index++){
            if(simCards[index].equals(existingSimCard)){
                simCards[index] = newSimCard;
                isUpdated = true;
            }
        }
        if(isUpdated){
            System.out.println("Updated Sim Card: "+ existingSimCard + " to " + newSimCard);
        }else{
            System.out.println("No match found cannot update.");
        }
        System.out.println();
        return isUpdated;
    }
}
