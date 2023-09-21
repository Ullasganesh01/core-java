class PatientTester {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.setPatientId(1);
        p1.setPatientName("Tejas");
        p1.setGender("Male");
        p1.setAge(22);
        p1.setAddress("Basaveshwar Nagar");
        p1.setBloodGroup("O+");
        p1.setContactNo(9113613239l);
        p1.setAttenderName("sharan");
        p1.setDiseaseName("Back Pain");
        p1.setConsultantName("Pavan");
        p1.setHospitalName("Manipal");
        p1.setFees(2500.30);
        p1.setWardNo("A-2");

        System.out.println("Patient Id : " + p1.getPatientId());
        System.out.println("Patient Name : " + p1.getPatientName());
        System.out.println("Gender : " + p1.getGender());
        System.out.println("Age : " + p1.getAge());
        System.out.println("Address : " + p1.getAddress());
        System.out.println("Blood Group : " + p1.getBloodGroup());
        System.out.println("Contact Number: " + p1.getContactNo());
        System.out.println("Attender Name : " + p1.getAttenderName());
        System.out.println("Disease : " + p1.getDiseaseName());
        System.out.println("Consultant Name : " + p1.getConsultantName());
        System.out.println("Hospital Name : " + p1.getHospitalName());
        System.out.println("Fees : " + p1.getFees());
        System.out.println("Ward Number : " + p1.getWardNo());
        System.out.println();

        Patient p2 = new Patient();
        p2.setPatientId(2);
        p2.setPatientName("Sharan");
        p2.setGender("Male");
        p2.setAge(23);
        p2.setAddress("Yeshwantpur");
        p2.setBloodGroup("A+");
        p2.setContactNo(9123658924l);
        p2.setAttenderName("ullas");
        p2.setDiseaseName("Migraine");
        p2.setConsultantName("Pranam");
        p2.setHospitalName("ESI");
        p2.setFees(1200.90);
        p2.setWardNo("B-6");

        System.out.println("Patient Id : " + p2.getPatientId());
        System.out.println("Patient Name : " + p2.getPatientName());
        System.out.println("Gender : " + p2.getGender());
        System.out.println("Age : " + p2.getAge());
        System.out.println("Address : " + p2.getAddress());
        System.out.println("Blood Group : " + p2.getBloodGroup());
        System.out.println("Contact Number: " + p2.getContactNo());
        System.out.println("Attender Name : " + p2.getAttenderName());
        System.out.println("Disease : " + p2.getDiseaseName());
        System.out.println("Consultant Name : " + p2.getConsultantName());
        System.out.println("Hospital Name : " + p2.getHospitalName());
        System.out.println("Fees : " + p2.getFees());
        System.out.println("Ward Number : " + p2.getWardNo());
        System.out.println();

        Patient p3 = new Patient();
        p3.setPatientId(3);
        p3.setPatientName("Ullas");
        p3.setGender("Male");
        p3.setAge(22);
        p3.setAddress("Kengeri");
        p3.setBloodGroup("A+");
        p3.setContactNo(8904603732l);
        p3.setAttenderName("Tejas");
        p3.setDiseaseName("Leg Pain");
        p3.setConsultantName("Vignesh");
        p3.setHospitalName("Apollo");
        p3.setFees(1658.78);
        p3.setWardNo("C-9");

        System.out.println("Patient Id : " + p3.getPatientId());
        System.out.println("Patient Name : " + p3.getPatientName());
        System.out.println("Gender : " + p3.getGender());
        System.out.println("Age : " + p3.getAge());
        System.out.println("Address : " + p3.getAddress());
        System.out.println("Blood Group : " + p3.getBloodGroup());
        System.out.println("Contact Number: " + p3.getContactNo());
        System.out.println("Attender Name : " + p3.getAttenderName());
        System.out.println("Disease : " + p3.getDiseaseName());
        System.out.println("Consultant Name : " + p3.getConsultantName());
        System.out.println("Hospital Name : " + p3.getHospitalName());
        System.out.println("Fees : " + p3.getFees());
        System.out.println("Ward Number : " + p3.getWardNo());
        
    }
}
