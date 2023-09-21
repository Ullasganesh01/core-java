class AC {
    static String name ="Voltas";
    static int minTemp = 16;
    static int maxTemp = 26;
    static int currentTemp = minTemp;
    static boolean isPowered;

    public static boolean onOrOff() {
        //System.out.println("Invoked onOrOff()");
        //System.out.println("Parameter : " + 0);
        if(isPowered ==  false){
            isPowered = true;
            System.out.println("AC is Switched ON.");
        }else if(isPowered == true){
            isPowered = false;
            System.out.println("AC is Switched OFF.");
        }
        //System.out.println("End of onOrOff()");
        System.out.println();
        return isPowered;
    }

    public static void increaseTemperature(){
        //System.out.println("Invoked increaseTemperature()");
       // System.out.println("Parameter : " + 0);
        if(isPowered==true){
            if(currentTemp<maxTemp){
                currentTemp++;
                System.out.println("Temperature is : "+currentTemp);
            }
            else{
                System.out.println("Max Temperature Reached.");
            }
        }
        else{
            System.out.println("Switch on the AC first.");
        }
        //System.out.println("End of increaseTemperature()");
        System.out.println();
    }
    public static void decreaseTemperature(){
        //System.out.println("Invoked decreaseTemperature()");
        //System.out.println("Parameter : " + 0);
        if(isPowered==true){
            if(currentTemp>minTemp){
                currentTemp--;
                System.out.println("Temperature is : " +currentTemp);
            }else{
                System.out.println("Min Temperature Reached.");
            }
        }else{
            System.out.println("Switch on the AC first.");
        }
        //System.out.println("End of decreaseTemperature()");
        System.out.println();
    }

}
