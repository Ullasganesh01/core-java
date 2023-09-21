class Tonique {
    static String alcoholBrand[] = {"Smirnoff","Absolut Vodka","Bacardi","Jameson Irish Whiskey","Johnnie Walker", "Captain Morgan","Jim Beam","Hennessy",
                                     "Royal Stag","Officer's Choice","Carlsberg Group","Emperador","Imperial Blue","KingFisher","Aelder",
                                     "Aluna","Archers","Barenjager","Bernard","Braemble","Calisay","Choya","Dolin","Fair","Fiorente",
                                     "Grand Marnier","Jack Daniels's","Malibu","Martini","Mr Black"};

    public static void main(String[] args) {
        System.out.println("Welcome to Tonique Wine Store!!");
        System.out.println("List of the top alcohol brands : ");
        getTonics(alcoholBrand);
        //System.out.println("\t"+alcoholBrand[0] + " ," +alcoholBrand[1] + " ," +alcoholBrand[2] + " ," +alcoholBrand[3] + " ,"+ alcoholBrand[4] 
        //+ " ," +"\n\t"+ alcoholBrand[5] + " ," +alcoholBrand[6] + " ," +alcoholBrand[7] + " ," +alcoholBrand[8] + " ," +alcoholBrand[9] 
        //+ " ," +"\n\t"+ alcoholBrand[10] + " ," +alcoholBrand[11] + " ," +alcoholBrand[12] + " ,"+alcoholBrand[13] + " ,"+alcoholBrand[14] 
        //+ " ," +"\n\t"+ alcoholBrand[15] + " ,"+alcoholBrand[16] + " ,"+alcoholBrand[17] + " ,"+alcoholBrand[18] + " ,"+alcoholBrand[19] 
        //+ " ," +"\n\t"+ alcoholBrand[20] + " ,"+alcoholBrand[21] + " ,"+alcoholBrand[22] + " ,"+alcoholBrand[23] + " ,"+alcoholBrand[24] 
        //+ " ," +"\n\t"+ alcoholBrand[25] + " ,"+alcoholBrand[26] + " ,"+alcoholBrand[27] + " ,"+alcoholBrand[28] + " ,"+alcoholBrand[29]);
        //for (int i=0;i<=alcoholBrand.length-1;i++){
        //    System.out.println(alcoholBrand[i]);
        //}
        
    }

    public static void getTonics(String alchols[]) {
        for(String alcohol:alcoholBrand){
            System.out.println(alcohol);
        }
    }
}
