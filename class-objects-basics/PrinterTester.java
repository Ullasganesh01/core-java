class PrinterTester{
	public static void main(String[] args) {
		Printer p1=new Printer("Hp","Colour",20000.0,150);
		p1.printDetails(p1);
		p1.print();

		Printer p2=new Printer("Hp","Black and white",20000.0 ,150);
		p2.printDetails(p2);
		p2.print();

		Printer p3=new Printer("Dell","Colour",25000.0 ,150);
		p3.printDetails(p3);
		p3.print();

		Printer p4=new Printer("Dell","Black and white",25000.0 ,150);
		p4.printDetails(p4);
		p4.print();

		Printer p5=new Printer("Lenovo","Colour",30000.0 ,150);
		p5.printDetails(p5);
		p5.print();

		Printer p6=new Printer("Lenovo","Black and white",30000.0 ,150);
		p6.printDetails(p6);
		p6.print();

		Printer p7=new Printer("Sony","Colour",35000.0 ,150);
		p7.printDetails(p7);
		p7.print();

		Printer p8=new Printer("Sony","Black and white",35000.0 ,150);
		p8.printDetails(p8);
		p8.print();

		Printer p9=new Printer("Shell","Colour",10000.0 ,150);
		p9.printDetails(p9);
		p9.print();

		Printer p10=new Printer("Shell","Black and white",10000.0 ,150);
		p10.printDetails(p10);
		p10.print();
	}
}