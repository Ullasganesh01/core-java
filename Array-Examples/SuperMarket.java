class SuperMarket{
    static String vegetable[] = {"Potato","Onion","Tomato","Carrot","Beans"};   

    static String biscuit[] = {"Bourbon","MarieGold","Parle-G","Maska-Chaska","Milkbikies","50-50","Dark Fanstasy","Monaco","Hide and Seek","Sunfeast Bounce"};

    static String perfumes[] = {"Denver","Villian","Benetton","AXE","NIVIA","Beardo","Park Avenue","KS","Wild Stone", "Fogg"};

    static String groceries[] = {"Rice","Wheat","Ragi","Dal","Spices","Oil","Egg","Sauce","Maggi", "Masala Sachets"};

    public static void main(String[] args) {
        //String groceries[] = {"Rice","Wheat","Ragi","Dal","Spices","Oil","Egg","Sauce","Maggi", "Masala Sachets"};

        System.out.println("Main Started");
        System.out.println("Welcome to the Super Market!!");
        getVegetables();
        getBiscuits();
        getPerfumes();
        getGroceries();
        System.out.println("Main Ended");    
    }
    
    public static void getVegetables(){
         System.out.println("Available Vegetables in this section : ");
       // System.out.println(vegetable[0]+" "+vegetable[1]+" "+vegetable[2]+" "+vegetable[3]+" "+vegetable[4]);
        for(String veg:vegetable){
            System.out.println(veg);
        }
    }

    public static void getBiscuits(){
        System.out.println();
        System.out.println("Biscuits available in this section : ");
        //System.out.println(biscuit[0] + " " +biscuit[1]+ " " +biscuit[2] + " " +biscuit[3]+ " " +biscuit[4]+ " " +biscuit[5] + " " +biscuit[6] + " " +biscuit[7]+ " " +biscuit[8]+ " " +biscuit[9]);
        for(String bis:biscuit){
            System.out.println(bis);
        }
    }

    public static void getPerfumes(){
        System.out.println();
        System.out.println("List of Perfumes available in this section : ");
        //System.out.println(perfumes[0]+ " " + perfumes[1]+ " " + perfumes[2]+ " " + perfumes[3]+ " " + perfumes[4]+ " " + perfumes[5]+ " " + perfumes[6]+ " " + perfumes[7]+ " " + perfumes[8]+ " " + perfumes[9]);
        for(String per:perfumes){
            System.out.println(per);
        }
    }
    
    public static void getGroceries(){
         System.out.println();
        System.out.println("List of Groceries available in this section : ");
        //System.out.println(groceries[0]+ " " + groceries[1]+ " " + groceries[2]+ " " + groceries[3]+ " " + groceries[4]+ " " + groceries[5]+ " " + groceries[6]+ " " + groceries[7]+ " " + groceries[8]+ " " + groceries[9]);
        for(String gro:groceries){
            System.out.println(gro);
        }
    }
}