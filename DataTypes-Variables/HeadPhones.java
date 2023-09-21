class HeadPhones {
    static String brandName = "SkullCandy";
    static double price = 1850.50;
    static String frequency = "35MHZ";
    static boolean isWireless = true;
    static String battery = "8hrs";
    
    public static void main(String[] args) {
        String Warranty = "1 year";
        String color = "black-red";
        System.out.println("Main Started");
        System.out.println("Headphone brand name: "+ brandName);
        System.out.println("Price: "+ price);
        System.out.println("Frequency: "+ frequency);
        System.out.println("Is Wireless: "+ isWireless);
        System.out.println("Battery life: "+ battery);
        System.out.println("Price: "+ price +"rs");
        System.out.println("Warranty Upto: "+ Warranty + " from date of billing.");
        System.out.println("Color: "+ color);
        System.out.println("Main Ended");
    }
}
