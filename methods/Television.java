class Television {
    static String name ="LG";
    static int minVolume = 0;
    static int maxVolume = 20;
    static int currentVolume;
    static boolean isPowered;
    static int currentChannel;
    static int maxChannelNumber = 20;
    static int minChannelNumber = 1;

    public static boolean onOrOff() {
        //System.out.println("Invoked onOrOff()");
        //System.out.println("Parameter : " + 0);
        if(isPowered ==  false){
            isPowered = true;
            System.out.println("TV is Switched ON.");
        }else if(isPowered == true){
            isPowered = false;
            System.out.println("TV is Switched OFF.");
        }
        //System.out.println("End of onOrOff()");
        System.out.println();
        return isPowered;
    }

    public static void increaseVolume(){
        //System.out.println("Invoked increaseVolume()");
       // System.out.println("Parameter : " + 0);
        if(isPowered==true){
            if(currentVolume<maxVolume){
                currentVolume++;
                System.out.println("Volume is : "+currentVolume);
            }
            else{
                System.out.println("Max Volume Reached.");
            }
        }
        else{
            System.out.println("Switch on the TV first.");
        }
        //System.out.println("End of increaseVolume()");
        System.out.println();
    }
    public static void decreaseVolume(){
        //System.out.println("Invoked decreaseVolume()");
        //System.out.println("Parameter : " + 0);
        if(isPowered==true){
            if(currentVolume>minVolume){
                currentVolume--;
                System.out.println("Volume is : " +currentVolume);
            }else{
                System.out.println("Min Volume Reached.");
            }
        }else{
            System.out.println("Switch on the TV first.");
        }
        //System.out.println("End of decreaseVolume()");
        System.out.println();
    }

    public static void changeChannelNumber(int number){
         //System.out.println("Invoked changeChannelNumber()");
       // System.out.println("Parameter : " + 1);
        if(isPowered == true){
            if(number>=minChannelNumber && number<=maxChannelNumber){
            currentChannel = number;
            System.out.println("Channel Number : "+ currentChannel);
            }else{
                System.out.println("No channel found. Please enter a correct channel number.");
            }
        }else{
            System.out.println("Switch on the TV first");
        }
        //System.out.println("End of changeChannelNumber()");
        System.out.println();
    }

    public static void increaseChannel(){
         //System.out.println("Invoked increaseChannel()");
       // System.out.println("Parameter : " + 0);
        if(isPowered == true){
            if(currentChannel<maxChannelNumber){
                currentChannel++;
                System.out.println("Channel Number : " + currentChannel);
            }
            else{
                System.out.println("Maximum Channel number reached");
            }
        }else{
            System.out.println("Switch on the Tv first");
        }
        //System.out.println("End of increaseChannel()");
        System.out.println();
    }

    public static void decreaseChannel(){
         //System.out.println("Invoked decreaseChannel()");
       // System.out.println("Parameter : " + 0);
        if(isPowered == true){
            if(currentChannel>minChannelNumber){
                currentChannel--;
                System.out.println("Channel Number : " + currentChannel);
            }else{
                System.out.println("Minimum Channel number reached");
            }
        }else{
            System.out.println("Switch on the Tv first");
        }
        //System.out.println("End of decreaseChannel()");
        System.out.println();
    }
}
