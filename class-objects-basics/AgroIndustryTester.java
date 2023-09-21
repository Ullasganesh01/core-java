class AgroIndustryTester {
    public static void main(String[] args) {
        AgroIndustry ai1 = new AgroIndustry();
        ai1.category = "produce-manufacture";
        ai1.type = "textile industry";
        System.out.println("AgroIndustry 1: ");
        System.out.println("Category : " + ai1.category);
        System.out.println("Type : "+ ai1.type);
        ai1.produce();

        AgroIndustry ai2 = new AgroIndustry();
        ai2.category = "produce-processing";
        ai2.type = "industry of food processing";
        System.out.println("AgroIndustry 2: ");
        System.out.println("Category : " + ai2.category);
        System.out.println("Type : "+ ai2.type);
        ai2.produce();

        AgroIndustry ai3 = new AgroIndustry();
        ai3.category = "produce-processing";
        ai3.type = "industry of diary";
        System.out.println("AgroIndustry 3: ");
        System.out.println("Category : " + ai3.category);
        System.out.println("Type : "+ ai3.type);
        ai3.produce();

        AgroIndustry ai4 = new AgroIndustry();
        ai4.category = "produce-manufacture";
        ai4.type = "industry of sugar";
        System.out.println("AgroIndustry 4: ");
        System.out.println("Category : " + ai4.category);
        System.out.println("Type : "+ ai4.type);
        ai4.produce();

        AgroIndustry ai5 = new AgroIndustry();
        ai5.category = "produce-manufacture";
        ai5.type = "industry of vegetable oil";
        System.out.println("AgroIndustry 5: ");
        System.out.println("Category : " + ai5.category);
        System.out.println("Type : "+ ai5.type);
        ai5.produce();

        AgroIndustry ai6 = new AgroIndustry();
        ai6.category = "produce-processing";
        ai6.type = "industry of tea";
        System.out.println("AgroIndustry 6: ");
        System.out.println("Category : " + ai6.category);
        System.out.println("Type : "+ ai6.type);
        ai6.produce();

        AgroIndustry ai7 = new AgroIndustry();
        ai7.category = "produce-processing";
        ai7.type = "industry of coffee";
        System.out.println("AgroIndustry 7: ");
        System.out.println("Category : " + ai7.category);
        System.out.println("Type : "+ ai7.type);
        ai7.produce();

        AgroIndustry ai8 = new AgroIndustry();
        ai8.category = "produce-manufacture";
        ai8.type = "industry of leather goods";
        System.out.println("AgroIndustry 8: ");
        System.out.println("Category : " + ai8.category);
        System.out.println("Type : "+ ai8.type);
        ai8.produce();

        AgroIndustry ai9 = new AgroIndustry();
        ai9.category = "produce-manufacture";
        ai9.type = "industry of bamboo";
        System.out.println("AgroIndustry 9: ");
        System.out.println("Category : " + ai9.category);
        System.out.println("Type : "+ ai9.type);
        ai9.produce();

        AgroIndustry ai10 = new AgroIndustry();
        ai10.category = "produce-manufacture";
        ai10.type = "industry of jute";
        System.out.println("AgroIndustry 10: ");
        System.out.println("Category : " + ai10.category);
        System.out.println("Type : "+ ai10.type);
        ai10.produce();
    }
}
