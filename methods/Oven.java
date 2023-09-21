class Oven {
    static String name ="Godrej";
    static int minTime = 10;
    static int maxTime = 60;
    static int timer;
    static boolean isPowered;

    public static boolean onOrOff() {
        //System.out.println("Invoked onOrOff()");
        //System.out.println("Parameter : " + 0);
        if(isPowered ==  false){
            isPowered = true;
            System.out.println("Oven is Switched ON.");
        }else if(isPowered == true){
            isPowered = false;
            System.out.println("Oven is Switched OFF.");
        }
        //System.out.println("End of onOrOff()");
        System.out.println();
        return isPowered;
    }

    public static void increaseTime(){
        //System.out.println("Invoked increaseTime()");
       // System.out.println("Parameter : " + 0);
        if(isPowered==true){
            if(timer<maxTime){
                timer = timer+10;
                System.out.println("Time is : "+timer);
            }
            else{
                System.out.println("Max Time Reached.");
            }
        }
        else{
            System.out.println("Switch on the Oven first.");
        }
        //System.out.println("End of increaseTime()");
        System.out.println();
    }
    public static void decreaseTime(){
        //System.out.println("Invoked decreaseTime()");
        //System.out.println("Parameter : " + 0);
        if(isPowered==true){
            if(timer>minTime){
                timer = timer-10;
                System.out.println("Time is : " +timer);
            }else{
                System.out.println("Min Time Reached.");
            }
        }else{
            System.out.println("Switch on the Oven first.");
        }
        //System.out.println("End of decreaseTime()");
        System.out.println();
    }
}
