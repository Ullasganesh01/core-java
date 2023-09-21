class Wallet{
	String brandname;
	double price;
	boolean isLeather;
	int noOfCompartments;

	Wallet(String brandname, double price, boolean isLeather, int noOfCompartments){
		this.brandname=brandname;
		this.price=price;
		this.isLeather=isLeather;
		this.noOfCompartments=noOfCompartments;
	}

	public void holdMoney(){
		System.out.println("Holding money");
		System.out.println();
	}

	public void printDetails(Wallet obj){
		System.out.println("Wallet Brand: "+obj.brandname);
		System.out.println("Price: "+obj.price);
		System.out.println("Leather: "+obj.isLeather);
		System.out.println("No of Compartment:"+obj.noOfCompartments);
	}
}