class SwitchBoard {
    String brandName;
    int price;
    String color;
    int noOfSwitches;
    //static int current;

    public SwitchBoard(String brandName, int price , String color, int noOfSwitches /* , int current*/) {
        
      this.brandName = brandName;
        this.price = price;
        this.color = color;
        this.noOfSwitches = noOfSwitches;
        //this.current = current;
        System.out.println("Invoked constructor ");
    }
     public void provideElectricity(){
        System.out.println("Electric current ");
        System.out.println();
     }

     public SwitchBoard(String brandName, int price , int noOfSwitches) {
      this("Tejas",450,"rain",30);
      this.brandName = brandName;
      this.price = price;
      this.noOfSwitches = noOfSwitches;
     }
     
     public SwitchBoard(String color) {
        this("Voltas",300,15);
        this.color = color;
     }
     public SwitchBoard() {
      this("Brown");
     }

    // public void createInstance(){
    //  SwitchBoard b1 = new SwitchBoard("Gm",200,10);
    //    System.out.println(b1.brandName + "  " + b1.color + " " + b1.noOfSwitches + " " + b1.price /*+ " " + b1.current*/);
//
    //    SwitchBoard b2 = new SwitchBoard("Red");
    //    System.out.println(b2.brandName + "  " + b2.color + " " + b2.noOfSwitches + " " + b2.price);
//
    // }
}
