class Snacks{
	String snackName;
	double price;
	String hotOrCold;
	boolean isSpicy;

	Snacks(String snackName, String hotOrCold, double price, boolean isSpicy){
		this.snackName=snackName;
		this.price=price;
		this.hotOrCold=hotOrCold;
		this.isSpicy=isSpicy;
	}

	public void provideFat(){
		 System.out.println("Providing fat");
		 System.out.println();
	}
	public void printSnacks(Snacks obj){
		System.out.println("Snack Name : "+obj.snackName);
		System.out.println("Price : Rs"+obj.price+"");
		System.out.println("Hot or cold : "+obj.hotOrCold);
		System.out.println("Is it spicy : "+obj.isSpicy);
	}
}