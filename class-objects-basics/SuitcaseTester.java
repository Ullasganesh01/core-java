class SuitcaseTester{
	public static void main(String[] args) {
		Suitcase s1= new Suitcase("VIP", 2000.0,20.0,true);
		s1.printDetails(s1);
		s1.holdItems();

		Suitcase s2= new Suitcase("Wildcraft", 3000.0,15.0,false);
		s2.printDetails(s2);
		s2.holdItems();

		Suitcase s3= new Suitcase("American Tourist", 4000.0,30.0,true);
		s3.printDetails(s3);
		s3.holdItems();

		Suitcase s4= new Suitcase("American", 1500.0,20.0,false);
		s4.printDetails(s4);
		s4.holdItems();

		Suitcase s5= new Suitcase("Tourister", 4600.0,50.0,true);
		s5.printDetails(s5);
		s5.holdItems();

		Suitcase s6= new Suitcase("Sky bags", 1300.0,20.0,false);
		s6.printDetails(s6);
		s6.holdItems();

		Suitcase s7= new Suitcase("wildcraft", 1400.0,60.0,true);
		s7.printDetails(s7);
		s7.holdItems();

		Suitcase s8= new Suitcase("Puma", 4000.0,20.0,false);
		s8.printDetails(s8);
		s8.holdItems();

		Suitcase s9= new Suitcase("Adidas", 6000.0,40.0,true);
		s9.printDetails(s9);
		s9.holdItems();

		Suitcase s10= new Suitcase("Nike", 2400.0,20.0,false);
		s10.printDetails(s10);
		s10.holdItems();
	}
}