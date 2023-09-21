class SatelliteTester{
	public static void main(String[] args) {
		
		Satellite s1=new Satellite("India","Andra Pradesh",2000, true);
		s1.printDetails(s1);
		s1.revolve();

		Satellite s2=new Satellite("India","Gujrat",2010, false);
		s2.printDetails(s2);
		s2.revolve();

		Satellite s3=new Satellite("Russia","Moscow",2000, true);
		s3.printDetails(s3);
		s3.revolve();

		Satellite s4=new Satellite("Russia","Gaitlin",2020, false);
		s4.printDetails(s4);
		s4.revolve();

		Satellite s5=new Satellite("USA","Los Angles",2006, true);
		s5.printDetails(s5);
		s5.revolve();

		Satellite s6=new Satellite("USA","Texas",1999, false);
		s6.printDetails(s6);
		s6.revolve();

		Satellite s7=new Satellite("China","Beijing",2015, true);
		s7.printDetails(s7);
		s7.revolve();

		Satellite s8=new Satellite("China","Beijing",2012, false);
		s8.printDetails(s8);
		s8.revolve();

		Satellite s9=new Satellite("Europe","London",2004, true);
		s9.printDetails(s9);
		s9.revolve();

		Satellite s10=new Satellite("Europe","France",2001, false);
		s10.printDetails(s10);
		s10.revolve();
	}
}