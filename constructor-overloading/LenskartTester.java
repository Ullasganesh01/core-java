class LensKartTester{
    public static void main(String[] args){
        LensKart lenskart=new LensKart();
        lenskart.typeOfSpecs="Plastic";
        lenskart.brandName="ray ban";
        lenskart.price=7500.00;
        lenskart.shape="rectangle";
        System.out.println(lenskart.typeOfSpecs+"   "+lenskart.brandName+"  "+lenskart.price+"   "+lenskart.shape);
    }
}