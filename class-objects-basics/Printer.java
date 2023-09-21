class Printer{

	String printerName;
	String typeOfPrinter;
	double price;
	int noOfSheets;

	Printer(String printerName, String typeOfPrinter, double price, int noOfSheets){
		this.printerName=printerName;
		this.typeOfPrinter=typeOfPrinter;
		this.price=price;
		this.noOfSheets=noOfSheets;
	}

	public void print(){
		System.out.println("Printing ..");
		System.out.println();
	}
	
	public void printDetails(Printer obj){
		System.out.println("Printer name: "+obj.printerName);
		System.out.println("Type of printer :"+obj.typeOfPrinter);
		System.out.println("Price : Rs"+obj.price);
		System.out.println("Sheet storage :"+obj.noOfSheets+" Sheets");
	}
}