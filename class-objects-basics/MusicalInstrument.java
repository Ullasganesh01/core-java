class MusicalInstrument{
	String instrumentName;
	double price;
	boolean isElectric;
	boolean inStock;

	MusicalInstrument(String instrumentName, double price, boolean isElectric,boolean inStock){
		this.instrumentName=instrumentName;
		this.price=price;
		this.isElectric=isElectric;
		this.inStock=inStock;
	}
	public void printDetails(MusicalInstrument obj){
		System.out.println("Instrument Name: "+obj.instrumentName);
		System.out.println("Price:"+obj.price);
		System.out.println("Is Electric Instrument: "+obj.isElectric);
		System.out.println("In Stock:"+obj.inStock);
	}
	public void sound(){
		System.out.println("Sounds");
		System.out.println();
	}
	
}