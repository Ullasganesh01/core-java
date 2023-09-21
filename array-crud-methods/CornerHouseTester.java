class CornerHouseTester {
    public static void main(String[] args) {
        CornerHouse.addIceCreams("Death By Chocolate");
        CornerHouse.addIceCreams("Cake-A-Mocha");
        CornerHouse.addIceCreams("Brownie Fudge Sundae");
        CornerHouse.addIceCreams("Brown Bomb");
        CornerHouse.addIceCreams("Dew Drop Sundae");
        CornerHouse.addIceCreams("Cake Fudge");

        CornerHouse.getIceCreams();
        String flavour = CornerHouse.getIcreCreamByName("Cale Fudge");
        System.out.println(flavour);

        CornerHouse.updateIceCream("Cake Fudge", "Choco Lava");
//
        //CornerHouse.getIceCreams();
        CornerHouse.dropIceCream("Brown Bomb");
        //CornerHouse.dropIceCream("Choco Lava");

        //int length = CornerHouse.deleteIceCream("Brown Bomb");
         //CornerHouse.postDeleteGetIceCreams(length);


        //int length1 = CornerHouse.deleteIceCream("Dew Drop Sundae");
        CornerHouse.getIceCreams();
        //CornerHouse.postDeleteGetIceCreams(length1);
        String flavour1 = CornerHouse.getIcreCreamByName("Dew Drop Sundae");
        System.out.println(flavour1);

       //CornerHouse.getIceCreams();
    }
}
