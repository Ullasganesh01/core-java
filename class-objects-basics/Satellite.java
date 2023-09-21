class Satellite{
	String country;
	String launchLocation;
	int launchYear;
	boolean isOperational;

	Satellite(String country,String launchLocation,int launchYear,boolean isOperational){
     this.country=country;
     this.launchLocation=launchLocation;
     this.launchYear=launchYear;
     this.isOperational=isOperational;
	}

	public void revolve(){
		System.out.println("Revolving..");
		System.out.println();
	}

	public void printDetails(Satellite obj){
		System.out.println("Satellite country: "+obj.country);
		System.out.println("Launch location: "+obj.launchLocation);
		System.out.println("Launch Year: "+obj.launchYear);
		System.out.println("Is Still operational: "+obj.isOperational);
	}
}