class Aeroplane {
    private static String name = "Airbus";
    private String classType; 
    private String brandName;
    private int terminalNo;
    private int noOftickets;

    
    //Aeroplane(int noOftickets,String classType) {
    //    this.noOftickets = noOftickets;
    //    this.classType = classType; 
    //    //char a =(char)System.in.read();
    //    
    //}
    
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Aeroplane.name = name;
    }
    
    public int getNoOftickets() {
        return noOftickets;
    }

    public void setNoOftickets(int noOftickets) {
        this.noOftickets = noOftickets;
    }

    public String getClassType() {
        return classType;
    }                                                               

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    } 

    public String getBrandName(){
        return brandName;
    }
    public int getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(int terminalNo) {
        this.terminalNo = terminalNo;
    }

}
