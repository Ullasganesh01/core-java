class Speaker {
    static String name ="JBL";
    static int minVolume;
    static int maxVolume=10;
    static int currentVolume;
    static boolean isConnected;

    public static boolean onOrOff() {
        //System.out.println("Invoked onOrOff()");
        //System.out.println("Parameter : " + 0);
        if(isConnected ==  false){
            isConnected = true;
            System.out.println("Speaker is Turned ON.");
        }else if(isConnected == true){
            isConnected = false;
            System.out.println("Speaker is Turned OFF.");
        }
        //System.out.println("End of onOrOff()");
        System.out.println();
        return isConnected;
    }

    public static void increaseVolume(){
        //System.out.println("Invoked increaseVolume()");
       // System.out.println("Parameter : " + 0);
        if(isConnected==true){
            if(currentVolume<maxVolume){
                currentVolume++;
                System.out.println("Volume is : "+currentVolume);
            }
            else{
                System.out.println("Max Volume Reached.");
            }
        }
        else{
            System.out.println("Turn on the speaker first.");
        }
        //System.out.println("End of increaseVolume()");
        System.out.println();
    }
    public static void decreaseVolume(){
        //System.out.println("Invoked decreaseVolume()");
        //System.out.println("Parameter : " + 0);
        if(isConnected==true){
            if(currentVolume>minVolume){
                currentVolume--;
                System.out.println("Volume is : " +currentVolume);
            }else{
                System.out.println("Min Volume Reached.");
            }
        }else{
            System.out.println("Turn on the speaker first.");
        }
        //System.out.println("End of decreaseVolume()");
        System.out.println();
    }

}
