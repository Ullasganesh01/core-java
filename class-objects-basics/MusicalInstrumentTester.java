class MusicalInstrumentTester{
	public static void main(String[] args) {
		MusicalInstrument m1=new MusicalInstrument("Guitar",2000.0,false,true);
		m1.printDetails(m1);
		m1.sound();

		MusicalInstrument m2=new MusicalInstrument("Electric Guitar",3500.0,true,true);
		m2.printDetails(m2);
		m2.sound();

		MusicalInstrument m3=new MusicalInstrument("Drums",5000.0,false,true);
		m3.printDetails(m3);
		m3.sound();

		MusicalInstrument m4=new MusicalInstrument("Flute",1500.0,false,false);
		m4.printDetails(m4);
		m4.sound();

		MusicalInstrument m5=new MusicalInstrument("Musical Keyboard",2000.0,true,true);
		m5.printDetails(m5);
		m5.sound();

		MusicalInstrument m6=new MusicalInstrument("Piano",20000.0,false,false);
		m6.printDetails(m6);
		m6.sound();

		MusicalInstrument m7=new MusicalInstrument("Violin",2500.0,false,true);
		m7.printDetails(m7);
		m7.sound();

		MusicalInstrument m8=new MusicalInstrument("Trumpet",2000.0,false,false);
		m8.printDetails(m8);
		m8.sound();

		MusicalInstrument m9=new MusicalInstrument("Harmonica",2000.0,false,true);
		m9.printDetails(m9);
		m9.sound();

		MusicalInstrument m10=new MusicalInstrument("Electric Drum",2000.0,true,false);
		m10.printDetails(m10);
		m10.sound();

	}
}