class Girias {
    
    public static void main(String[] args) {
        System.out.println("Main Started");
        String electronicDevices[] = {"TV","OVEN","FRIDGE","STOVE","LAPTOPS","WASHING MACHINES"};
        double price[] = {35000.70,4500.65,65000.00,5000,74000.35,80000};
        System.out.println("List of Electronic Devices are :");
        for(String i : electronicDevices){
            System.out.println(i);            
        }
        System.out.println("The price of Devices are");
        for(double rs:price){
            System.out.println(rs);
        }
        System.out.println("Main Ended");
    }
}
