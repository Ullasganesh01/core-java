class Mixer {
    static String name ="Kailash";
    static int minSpeed = 0;
    static int maxSpeed = 6;
    static int currentSpeed;
    static boolean isPowered;

    public static boolean onOrOff() {
        //System.out.println("Invoked onOrOff()");
        //System.out.println("Parameter : " + 0);
        if(isPowered ==  false){
            isPowered = true;
            System.out.println("Mixer is Switched ON.");
        }else if(isPowered == true){
            isPowered = false;
            System.out.println("Mixer is Switched OFF.");
            currentSpeed=0;
        }
        //System.out.println("End of onOrOff()");
        System.out.println();
        return isPowered;
    }

    public static void increaseSpeed(){
        //System.out.println("Invoked increaseSpeed()");
       // System.out.println("Parameter : " + 0);
        if(isPowered==true){
            if(currentSpeed<maxSpeed){
                currentSpeed++;
                System.out.println("Speed is : "+currentSpeed);
            }
            else{
                System.out.println("Max Speed Reached.");
            }
        }
        else{
            System.out.println("Switch on the Mixer first.");
        }
        //System.out.println("End of increaseSpeed()");
        System.out.println();
    }
    public static void decreaseSpeed(){
        //System.out.println("Invoked decreaseSpeed()");
        //System.out.println("Parameter : " + 0);
        if(isPowered==true){
            if(currentSpeed>minSpeed){
                currentSpeed--;
                System.out.println("Speed is : " +currentSpeed);
            }else{
                System.out.println("Min Speed Reached.");
            }
        }else{
            System.out.println("Switch on the Mixer first.");
        }
        //System.out.println("End of decreaseSpeed()");
        System.out.println();
    }

}
