class SnacksTester{
	public static void main(String[] args) {
		Snacks obj1=new Snacks("Masala puri","hot",30.0 ,true);
		obj1.printSnacks(obj1);
		obj1.provideFat();

		Snacks obj2=new Snacks("Samosa","hot",20.0 ,true);
		obj2.printSnacks(obj2);
		obj2.provideFat();

		Snacks obj3=new Snacks("Chips","Cold",15.0 ,false);
		obj3.printSnacks(obj3);
		obj3.provideFat();

		Snacks obj4=new Snacks("Ice cream","Cold",40.0 ,false);
		obj4.printSnacks(obj4);
		obj4.provideFat();

		Snacks obj5=new Snacks("Chocolate","Cold",40.0 ,false);
		obj5.printSnacks(obj5);
		obj5.provideFat();

		Snacks obj6=new Snacks("Bhel puri","Cold",35.0 ,true);
		obj6.printSnacks(obj6);
		obj6.provideFat();

		Snacks obj7=new Snacks("Rolls","Hot",60.0 ,true);
		obj7.printSnacks(obj7);
		obj7.provideFat();

		Snacks obj8=new Snacks("French fries","hot",60.0 ,false);
		obj8.printSnacks(obj8);
		obj8.provideFat();

		Snacks obj9=new Snacks("Sandwich","hot",40.0 ,false);
		obj9.printSnacks(obj9);
		obj9.provideFat();

		Snacks obj10=new Snacks("Oreo Milkshake","Cold",40.0 ,false);
		obj10.printSnacks(obj10);
		obj10.provideFat();		
	}
}