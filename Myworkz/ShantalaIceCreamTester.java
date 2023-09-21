class ShantalaIceCreamTester {
    public static void main(String[] args) {
        ShantalaIceCream.addIceCreamFlavor("Vanilla");
        ShantalaIceCream.addIceCreamFlavor("Chocolate");
        ShantalaIceCream.addIceCreamFlavor("Pista");
        ShantalaIceCream.addIceCreamFlavor("Mango");
        ShantalaIceCream.addIceCreamFlavor("Tender Coconut");
        ShantalaIceCream.addIceCreamFlavor("Strawberry");
        ShantalaIceCream.addIceCreamFlavor("Black Current");
        ShantalaIceCream.addIceCreamFlavor("Blue Berry");
        ShantalaIceCream.addIceCreamFlavor(null);

        ShantalaIceCream.printIceCreamFlavors();
        ShantalaIceCream.getIndexValue();
        //ShantalaIceCream.getIceCreamFlavors();

        ShantalaIceCream.updateIceCreamFlavor("Mango", "Rose");
        ShantalaIceCream.updateIceCreamFlavor("Mango", null);
        ShantalaIceCream.updateIceCreamFlavor(null, null);
        ShantalaIceCream.updateIceCreamFlavor(null, "Rose");
        ShantalaIceCream.updateIceCreamFlavor("Black Current", "Guava");
        ShantalaIceCream.updateIceCreamFlavor("Current", "Guava");

        ShantalaIceCream.printIceCreamFlavors();
        //ShantalaIceCream.getIceCreamFlavors();

        ShantalaIceCream.deleteIceCreamFlavor("Rose");
        ShantalaIceCream.printIceCreamFlavors();
        //ShantalaIceCream.getIceCreamFlavors();

        ShantalaIceCream.deleteIceCreamFlavor("Chocolate");
        ShantalaIceCream.printIceCreamFlavors();
        //ShantalaIceCream.getIceCreamFlavors();

        ShantalaIceCream.deleteIceCreamFlavor("Guava");
        ShantalaIceCream.printIceCreamFlavors();
        ShantalaIceCream.getIndexValue();
        //ShantalaIceCream.getIceCreamFlavors();

        ShantalaIceCream.addIceCreamFlavor("Blue Berry");
        ShantalaIceCream.printIceCreamFlavors();
         //ShantalaIceCream.getIceCreamFlavors();

         ShantalaIceCream.deleteIceCreamFlavor("Vanilla");
         ShantalaIceCream.printIceCreamFlavors();
         ShantalaIceCream.getIndexValue();

         ShantalaIceCream.printIceCreamFlavors("Pista");

         ShantalaIceCream.deleteIceCreamFlavor("Tender Coconut");
         ShantalaIceCream.printIceCreamFlavors();
         ShantalaIceCream.getIndexValue();

         ShantalaIceCream.deleteIceCreamFlavor(null);

         ShantalaIceCream.deleteIceCreamFlavor("Pista");
         ShantalaIceCream.printIceCreamFlavors();
         ShantalaIceCream.getIndexValue();

         ShantalaIceCream.deleteIceCreamFlavor("Strawberry");
         ShantalaIceCream.printIceCreamFlavors();
         ShantalaIceCream.getIndexValue();

         ShantalaIceCream.deleteIceCreamFlavor("Guava");
         ShantalaIceCream.printIceCreamFlavors();
         ShantalaIceCream.getIndexValue();
    }
}
