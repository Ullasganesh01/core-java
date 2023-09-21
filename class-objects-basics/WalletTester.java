class WalletTester{
	public static void main(String[] args) {
		Wallet w1= new Wallet("Allen Solly",500.0 , true,4);
		w1.printDetails(w1);
		w1.holdMoney();

		Wallet w2= new Wallet("Amazon",500.0 , false,3);
		w2.printDetails(w2);
		w2.holdMoney();

		Wallet w3= new Wallet("Myntra",600.0 , true,4);
		w3.printDetails(w3);
		w3.holdMoney();

		Wallet w4= new Wallet("Flipkart",600.0 , false,5);
		w4.printDetails(w4);
		w4.holdMoney();

		Wallet w5= new Wallet("Bata",1000.0 , true,4);
		w5.printDetails(w5);
		w5.holdMoney();

		Wallet w6= new Wallet("Puma",1000.0 , false,5);
		w6.printDetails(w6);
		w6.holdMoney();

		Wallet w7= new Wallet("Adidas",1500.0 , true,3);
		w7.printDetails(w7);
		w7.holdMoney();

		Wallet w8= new Wallet("Nike",1500.0 , false,4);
		w8.printDetails(w8);
		w8.holdMoney();

		Wallet w9= new Wallet("Peter England",2000.0 , true,4);
		w9.printDetails(w9);
		w9.holdMoney();

		Wallet w10= new Wallet("Titan",2000.0 , false,5);
		w10.printDetails(w10);
		w10.holdMoney();
	}
}