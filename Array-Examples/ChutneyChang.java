class ChutneyChang {
     static String vegMenu[] = {"Veg Sweet Corn Soup","Green Salad", "Pickled Cucumber" , "Beansprout Salad","Panner Tikka",
                                "Achari Gobi","Veg Momo","Creamy Corn","Dal Makhani","Kadai Panner","Mix Veg Hyderbadi","Veg Dum Biryani",
                                "Veg Fried Rice","Roti","Naan","Kulcha","Gajar ka Halwa","Jalebi"};

    static String nonVegMenu[] = {"Chicken Lung Fung Soup","Russian Salad","Vetnamese Salad","Tawa Fish","Chicken Momo","Murgh Vindaloo",
                                    "Murgh Rogan Jose","Mutton Dum Biryani","Egg Chilli Noodles"};

    public static void main(String[] args) {
        System.out.println("Welcome to Chutney Chang!!");
        System.out.println("Veg Menu :");
        //System.out.println("\t"+vegMenu[0] + ", "+vegMenu[1] + ", "+vegMenu[2] + ", "+vegMenu[3] + ", "+vegMenu[4] + ", "+vegMenu[5] + ", "+
        //                   "\n\t" +vegMenu[6] + ", "+vegMenu[7] + ", "+vegMenu[8] + ", "+vegMenu[9] + ", "+vegMenu[10] + ", "+vegMenu[11] + ", "+
        //                   "\n\t" +vegMenu[12] + ", "+vegMenu[13] + ", "+vegMenu[14] + ", "+vegMenu[15] + ", "+vegMenu[16] + ", "+vegMenu[17]+"\n");
        for(String veg:vegMenu){
            System.out.println(veg);
        }
        System.out.println("Non-Veg Menu :");                   
        //System.out.println("\t"+nonVegMenu[0] + ", "+nonVegMenu[1] + ", "+nonVegMenu[2] + ", "+nonVegMenu[3] + ", "+nonVegMenu[4]+", "+
        //                   "\n\t" +nonVegMenu[5] + ", "+ nonVegMenu[6] + ", "+nonVegMenu[7] + ", "+nonVegMenu[8]); 
        for(String non:nonVegMenu){
            System.out.println(non);
        }
    }
}
