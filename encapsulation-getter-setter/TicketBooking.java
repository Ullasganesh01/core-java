class TicketBooking{
	int bookingId;
	int noOfSeats;
	String source;
	String destination;
	String date;
	String timings;
	int pnr;
	double price;
	String seatClass;
	String bookingType;
	String transportName;
    
	public void setBookingId(int bookingId){
		this.bookingId=bookingId;
	}
	public int getBookingId(){
		return bookingId;
	}
	
	public void setNoOfSeats(int noOfSeats){
		this.noOfSeats=noOfSeats;
	}
	public int getNoOfSeats(){
		return noOfSeats;
	}

	public void setSource(String source){
		this.source=source;
	}
	public String getSource(){
		return source;
	}

	public void setDestination(String destination){
		this.destination=destination;
	}
	public String getDestination(){
		return destination;
	}

	public void setDate(String date){
		this.date=date;
	}
	public String getDate(){
		return date;
	}

	public void setTimings(String timings){
		this.timings=timings;
	}
	public String getTimings(){
		return timings;
	}

	public void setPnr(int pnr){
		this.pnr=pnr;
	}
	public int getPnr(){
		return pnr;
	}

	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}

	public void setSeatClass(String seatClass){
		this.seatClass=seatClass;
	}
	public String getSeatClass(){
		return seatClass;
	}

	public void setBookingType(String bookingType){
		this.bookingType=bookingType;
	}
	public String getBookingType(){
		return bookingType;
	}

	public void setTransportName(String transportName){
		this.transportName=transportName;
	}
	public String getTransportName(){
		return transportName;
	}
	
}