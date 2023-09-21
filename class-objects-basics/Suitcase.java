class Suitcase{
	String suitcaseName;
	double price;
	double capacity;
	boolean inStock;

	Suitcase(String suitcaseName,double price,double capacity,boolean inStock){
		this.suitcaseName=suitcaseName;
		this.price=price;
		this.capacity=capacity;
		this.inStock=inStock;
	}

	public void holdItems(){
		System.out.println("Holding items..");
		System.out.println();
	}

	public void printDetails(Suitcase obj){
		System.out.println("Name: "+obj.suitcaseName);
		System.out.println("Price: "+obj.price);
		System.out.println("Capacity: "+obj.capacity);
		System.out.println("In Stock: "+obj.inStock);
	}
}