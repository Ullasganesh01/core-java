class AeroplaneTester {
    public static void main(String[] args) {
        Aeroplane a = new Aeroplane();
        a.setBrandName("Emirates");
        a.setClassType("Business");
        a.setNoOftickets(3);
        a.setTerminalNo(2);

        System.out.println(a.getBrandName());
        System.out.println(a.getClassType());
        System.out.println(a.getNoOftickets());
        System.out.println(a.getTerminalNo()); 
        System.out.println(Aeroplane.getName());
        System.out.println();

        

        Aeroplane a1 = new Aeroplane();
        a1.setBrandName("KingFisher");
        a1.setClassType("Economy");
        a1.setNoOftickets(5);
        a1.setTerminalNo(1);

        System.out.println(a1.getBrandName());
        System.out.println(a1.getClassType());
        System.out.println(a1.getNoOftickets());
        System.out.println(a1.getTerminalNo()); 
        System.out.println(Aeroplane.getName());

        
    
    }
}
