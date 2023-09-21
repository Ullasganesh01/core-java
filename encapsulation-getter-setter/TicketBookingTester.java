class TicketBookingTester{
	public static void main(String[] args) {

		TicketBooking t1= new TicketBooking();
		t1.setBookingId(1);
		t1.setNoOfSeats(4);
		t1.setSource("Mysore");
		t1.setDestination("Bangalore");
		t1.setDate("August 2");
		t1.setTimings("09am");
		t1.setPnr(124);
		t1.setPrice(690.0);
		t1.setSeatClass("AC");
		t1.setBookingType("online");
		t1.setTransportName("Train");
		System.out.println("BookingId : " + t1.getBookingId());
		System.out.println("NoOfSeats : " + t1.getNoOfSeats());
		System.out.println("Source : " + t1.getSource());
		System.out.println("Destination : " + t1.getDestination());
		System.out.println("Date : " + t1.getDate());
		System.out.println("Timings : " + t1.getTimings());
		System.out.println("Pnr : " + t1.getPnr());
		System.out.println("Price : " + t1.getPrice());
		System.out.println("SeatClass : " + t1.getSeatClass());
		System.out.println("BookingType : " + t1.getBookingType());
		System.out.println("TransportName : " + t1.getTransportName());
		System.out.println();

		TicketBooking t2= new TicketBooking();
		t2.setBookingId(2);
		t2.setNoOfSeats(6);
		t2.setSource("Tumkur");
		t2.setDestination("Bangalore");
		t2.setDate("August 10");
		t2.setTimings("09am");
		t2.setPnr(126);
		t2.setPrice(560.0);
		t2.setSeatClass("AC");
		t2.setBookingType("online");
		t2.setTransportName("Flight");
		System.out.println("BookingId : " + t2.getBookingId());
		System.out.println("NoOfSeats : " + t2.getNoOfSeats());
		System.out.println("Source : " + t2.getSource());
		System.out.println("Destination : " + t2.getDestination());
		System.out.println("Date : " + t2.getDate());
		System.out.println("Timings : " + t2.getTimings());
		System.out.println("Pnr : " + t2.getPnr());
		System.out.println("Price : " + t2.getPrice());
		System.out.println("SeatClass : " + t2.getSeatClass());
		System.out.println("BookingType : " + t2.getBookingType());
		System.out.println("TransportName : " + t2.getTransportName());
		System.out.println();

		TicketBooking t3= new TicketBooking();
		t3.setBookingId(3);
		t3.setNoOfSeats(2);
		t3.setSource("Bangalore");
		t3.setDestination("mysore");
		t3.setDate("August 1");
		t3.setTimings("09am");
		t3.setPnr(123);
		t3.setPrice(690.0);
		t3.setSeatClass("AC");
		t3.setBookingType("online");
		t3.setTransportName("Bus");
	    System.out.println("BookingId : " + t3.getBookingId());
		System.out.println("NoOfSeats : " + t3.getNoOfSeats());
		System.out.println("Source : " + t3.getSource());
		System.out.println("Destination : " + t3.getDestination());
		System.out.println("Date : " + t3.getDate());
		System.out.println("Timings : " + t3.getTimings());
		System.out.println("Pnr : " + t3.getPnr());
		System.out.println("Price : " + t3.getPrice());
		System.out.println("SeatClass : " + t3.getSeatClass());
		System.out.println("BookingType : " + t3.getBookingType());
		System.out.println("TransportName : " + t3.getTransportName());
	}
}