class BankTester {
    public static void main(String[] args) {
        BankDTO b1 = new BankDTO();
        b1.setBankId(1);
        b1.setBankName("HDFC");
        b1.setBranch("Bagmane Tech Park");
        b1.setBranchCode(9286);
        b1.setAddress("Marathahalli, Bangalore, Karnataka");
        b1.setHelpLineNo(802345892l);
        b1.setBankManager("Veerappa");
        b1.setIfscCode("HDFC0009286");
        b1.setMicrCode(560240169);
        b1.setNoOfLockers(150);
        b1.setNoOfEmployees(17);
        b1.setTimings("10.00 AM to 2.00 PM and 2.45 PM to 4.30 PM");
        b1.setWebsite("www.Hdfc.in");

        System.out.println("Bank Id : " + b1.getBankId());
        System.out.println("Bank Name : " + b1.getBankName());
        System.out.println("Branch : " + b1.getBranch());
        System.out.println("Branch Code : " + b1.getBranchCode());
        System.out.println("Address : " + b1.getAddress());
        System.out.println("HelpLine Number : " + b1.getHelpLineNo());
        System.out.println("Bank Manager : " + b1.getBankManager());
        System.out.println("IFSC Code : " + b1.getIfscCode());
        System.out.println("MICR Code : " + b1.getMicrCode());
        System.out.println("No of Lockers : " + b1.getNoOfLockers());
        System.out.println("No of Employees : " + b1.getNoOfEmployees());
        System.out.println("Timings : " + b1.getTimings());
        System.out.println("Website : " + b1.getWebsite());
        System.out.println();

        BankDTO b2 = new BankDTO();
        b2.setBankId(2);
        b2.setBankName("Axis");
        b2.setBranch("Mg Road");
        b2.setBranchCode(2986);
        b2.setAddress("No. 9, M. G. Road, Block A, Bangalore");
        b2.setHelpLineNo(25317830);
        b2.setBankManager("Madesh");
        b2.setIfscCode("UTIB0000009");
        b2.setMicrCode(560211002);
        b2.setNoOfLockers(250);
        b2.setNoOfEmployees(25);
        b2.setTimings("10.00 AM to 2.00 PM and 2.45 PM to 5.30 PM");
        b2.setWebsite("www.Axisbank.in");

        System.out.println("Bank Id : " + b2.getBankId());
        System.out.println("Bank Name : " + b2.getBankName());
        System.out.println("Branch : " + b2.getBranch());
        System.out.println("Branch Code : " + b2.getBranchCode());
        System.out.println("Address : " + b2.getAddress());
        System.out.println("HelpLine Number : " + b2.getHelpLineNo());
        System.out.println("Bank Manager : " + b2.getBankManager());
        System.out.println("IFSC Code : " + b2.getIfscCode());
        System.out.println("MICR Code : " + b2.getMicrCode());
        System.out.println("No of Lockers : " + b2.getNoOfLockers());
        System.out.println("No of Employees : " + b2.getNoOfEmployees());
        System.out.println("Timings : " + b2.getTimings());
        System.out.println("Website : " + b2.getWebsite());
        System.out.println();

        BankDTO b3 = new BankDTO();
        b3.setBankId(3);
        b3.setBankName("Canara");
        b3.setBranch("Begur");
        b3.setBranchCode(437);
        b3.setAddress("Mary Nilaya Joseph Garden,Begur");
        b3.setHelpLineNo(25742041);
        b3.setBankManager("Sandesh");
        b3.setIfscCode("CNRB0000437");
        b3.setMicrCode(560015093);
        b3.setNoOfLockers(200);
        b3.setNoOfEmployees(22);
        b3.setTimings("10.00 AM to 2.00 PM and 2.45 PM to 4.30 PM");
        b3.setWebsite("www.Canara.in");

        System.out.println("Bank Id : " + b3.getBankId());
        System.out.println("Bank Name : " + b3.getBankName());
        System.out.println("Branch : " +  b3.getBranch());
        System.out.println("Branch Code : " + b3.getBranchCode());
        System.out.println("Address : " + b3.getAddress());
        System.out.println("HelpLine Number : " + b3.getHelpLineNo());
        System.out.println("Bank Manager : " +  b3.getBankManager());
        System.out.println("IFSC Code : " + b3.getIfscCode());
        System.out.println("MICR Code : "  + b3.getMicrCode());
        System.out.println("No of Lockers : " + b3.getNoOfLockers());
        System.out.println("No of Employees : " + b3.getNoOfEmployees());
        System.out.println("Timings : " + b3.getTimings());
        System.out.println("Website : " + b3.getWebsite());
        System.out.println();
    }
    
   
}
