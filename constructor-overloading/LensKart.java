class LensKart{
	String typeOfSpecs;
	String brandName;
	double price;
	String shape;

	public LensKart(){
		System.out.println("default value");
	}

	public LensKart(String typeOfSpecs,String brandName,String shape){
		this.typeOfSpecs=typeOfSpecs;
		this.brandName=brandName;
		this.shape=shape;
	}

	public LensKart(double price){
		this.price=price;
	}

}