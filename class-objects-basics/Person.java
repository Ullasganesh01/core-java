class Person{
	String name;
	String college;
	int age;
	long phno;

	Person(String name, String college, int age, long phno){
		this.name=name;
		this.college=college;
		this.age=age;
		this.phno=phno;
	}

	public void think(){
		System.out.println("Think and act");
		System.out.println();
	}

	public void printDetails(Person obj){
		System.out.println("Name: "+obj.name);
		System.out.println("College: "+obj.college);
		System.out.println("Age: "+obj.age);
		System.out.println("Phone Number: "+obj.phno);

	}
}