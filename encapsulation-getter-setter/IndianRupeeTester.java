class IndianRupeeTester
{
 public static void main(String args[])
 {  
  IndianRupee.noOfLanguages = 15;
  
  IndianRupee twoHundredRupee = new IndianRupee();
  twoHundredRupee.setRupeeId("1");
  twoHundredRupee.setRupeeName("Two hundred Rupee");
  twoHundredRupee.setPrintDate(2022);
  twoHundredRupee.setColor("Orange");
  twoHundredRupee.setSerialNo("00A775312");
  twoHundredRupee.setBackSidePlaceName(" Sanchi Stupa");
  twoHundredRupee.setLocation("Nashik");
  twoHundredRupee.setSize("66 X 150 mm");
  System.out.println("Rupee id : " +twoHundredRupee.getRupeeId());
  System.out.println("Rupee name : " +twoHundredRupee.getRupeeName());
  System.out.println("Date of print : " +twoHundredRupee.getprintDate());
  System.out.println("Color of note : " +twoHundredRupee.getColor());
  System.out.println("Serial no : " +twoHundredRupee.getSerialNo());
  System.out.println("No of languages : " +IndianRupee.noOfLanguages);
  System.out.println("Name of monument : " +twoHundredRupee.getBackSidePlaceName());
  System.out.println("Location: " +twoHundredRupee.getLocation());
  System.out.println("Size of note : " +twoHundredRupee.getSize());
  System.out.println();

  IndianRupee fiftyRupee = new IndianRupee();
  fiftyRupee.setRupeeId("2");
  fiftyRupee.setRupeeName("Fifty Rupee");
  fiftyRupee.setPrintDate(2023);
  fiftyRupee.setColor("Blue");
  fiftyRupee.setSerialNo("00A375312");
  fiftyRupee.setBackSidePlaceName(" Hampi");
  fiftyRupee.setLocation("Karnataka");
  fiftyRupee.setSize("66 X 135 mm");
  System.out.println("Rupee id : " +fiftyRupee.getRupeeId());
  System.out.println("Rupee name : " +fiftyRupee.getRupeeName());
  System.out.println("Date of print : " +fiftyRupee.getprintDate());
  System.out.println("Color of note : " +fiftyRupee.getColor());
  System.out.println("Serial no : " +fiftyRupee.getSerialNo());
  System.out.println("No of languages : " +IndianRupee.noOfLanguages);
  System.out.println("Name of monument : " +fiftyRupee.getBackSidePlaceName());
  System.out.println("Location: " +fiftyRupee.getLocation());
  System.out.println("Size of note : " +fiftyRupee.getSize());
  System.out.println();

  IndianRupee twentyRupee = new IndianRupee();
  twentyRupee.setRupeeId("3");
  twentyRupee.setRupeeName("Twenty Rupee");
  twentyRupee.setPrintDate(2019);
  twentyRupee.setColor("Green");
  twentyRupee.setSerialNo("00A373512");
  twentyRupee.setBackSidePlaceName("Ellora Caves");
  twentyRupee.setLocation("Delhi");
  twentyRupee.setSize("14.7 X 6.2 cm");
  System.out.println("Rupee id : " +twentyRupee.getRupeeId());
  System.out.println("Rupee name : " +twentyRupee.getRupeeName());
  System.out.println("Date of print : " +twentyRupee.getprintDate());
  System.out.println("Color of note : " +twentyRupee.getColor());
  System.out.println("Serial no : " +twentyRupee.getSerialNo());
  System.out.println("No of languages : " +IndianRupee.noOfLanguages);
  System.out.println("Name of monument : " +twentyRupee.getBackSidePlaceName());
  System.out.println("Location: " +twentyRupee.getLocation());
  System.out.println("Size of note : " +twentyRupee.getSize());
  System.out.println();

  }
}