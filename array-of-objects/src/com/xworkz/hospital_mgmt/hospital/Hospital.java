package com.xworkz.hospital_mgmt.hospital;

import com.xworkz.hospital_mgmt.constants.BloodGroup;
import com.xworkz.hospital_mgmt.constants.Gender;
import com.xworkz.hospital_mgmt.constants.WardNumber;
import com.xworkz.hospital_mgmt.dto.PatientDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.util.Arrays;
import java.util.Scanner;

@Getter
@NoArgsConstructor

@AllArgsConstructor

public class Hospital {
   private PatientDTO[] patients;
   private int index;
   private int id;
   private int size;
   private String hospitalName;
    Scanner sc = new Scanner(System.in);


   public Hospital(String hospitalName){
       this.hospitalName = hospitalName;
       System.out.println("Enter the number of patients to be created : ");
       this.size = sc.nextInt();
       patients = new PatientDTO[size];
       for (int i = 0; i < size;i++){
           PatientDTO patientDTO = new PatientDTO();
           providePatientDetails(patientDTO);
           patients[i] = patientDTO;
       }
   }

    @Override
    public String toString() {
        return "Hospital{" +
                "patients : " + Arrays.toString(patients) +
                '}';
    }

    public void providePatientDetails(PatientDTO patient){

        //System.out.println("Enter the patient id : ");
        patient.setPatientId(++id);
        //this.setPatientId(sc.nextInt());

        System.out.println("Enter the patient name : ");
        patient.setPatientName(sc.next().toLowerCase());

        System.out.println("Enter the bloodGroup from the values below : ");
        for(BloodGroup bloodGroup : BloodGroup.values()){
            System.out.print(bloodGroup + ", ");
        }
        System.out.println();
        //System.out.println("[APOS, BPOS, ANEG, BNEG, OPOS, ONEG, ABPOS, ABNEG]");
        patient.setBloodGroup(BloodGroup.valueOf(sc.next().toUpperCase()));

        System.out.println("Enter the patient age : ");
        patient.setAge(sc.nextInt());

        System.out.println("Enter the patient gender from the values below : ");
        for(Gender gender : Gender.values()){
            System.out.print(gender + ", ");
        }
        System.out.println();
        //System.out.println("[MALE, FEMALE, TRANSGENDER, OTHERS]");
        patient.setGender(Gender.valueOf(sc.next().toUpperCase()));

        System.out.println("Enter the patient address : ");
        patient.setAddress(sc.next().toLowerCase());

        System.out.println("Enter the patient contactNo : ");
        patient.setContactNo(sc.nextLong());

        System.out.println("Enter the patient attenderName : ");
        patient.setAttenderName(sc.next().toLowerCase());

        System.out.println("Enter the patient fees : ");
        patient.setFees(sc.nextDouble());

        //System.out.println("Enter the patient hospitalName : ");
        patient.setHospitalName(hospitalName);

        System.out.println("Enter the patient wardNo from the values below : ");
        for(WardNumber wardNumber : WardNumber.values()){
            System.out.print(wardNumber + ", ");
        }
        System.out.println();
        //System.out.println("[A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4]");
        patient.setWardNo(WardNumber.valueOf(sc.next().toUpperCase()));

        System.out.println("Enter the patient diseaseName : ");
        patient.setDiseaseName(sc.next().toLowerCase());

        System.out.println("Enter the patient consultantName : ");
        patient.setConsultantName(sc.next().toLowerCase());

        System.out.println("Patients data has been received\n");
        createPatient(patient);

    }



    private boolean createPatient(PatientDTO patient){
        if(patient != null) {
            if (index < patients.length) {
                this.patients[index++] = patient;
                System.out.println("Patients data has been saved\n");
                return true;
            } else {
                System.out.println("No more space");
                return false;
            }
        }else {
            System.out.println("Patient is null");
            return false;
        }
    }

    private void getPatients(){
       if (index>0){
           System.out.println("Patient Details : ");
           for(int i=0;i<index;i++){
               System.out.println(patients[i]);
           }
       }else {
           System.out.println("No patients are admitted");
       }
    }

    private void getAllPatients(){
        for(PatientDTO patientDTO : patients) {
            System.out.println(patientDTO);
        }
    }

    public void hospitalOptions(){
        System.out.println(".............Welcome to Hospital......... ");
        System.out.println("How can i help you? ");
        while (true){
            System.out.println("1 -> To Fetch patients data\n" +
                    "2 -> To Update patients data\n" +
                    "3 -> Get Patient details\n" +
                    "4 -> Discharge Patient\n" +
                    "5 -> Exit");

            int choice = sc.nextInt();
            if(choice < 5){
                switch (choice){
                    case 1 : hospitalFetchOptions();
                             break;
                    case 2 : hospitalUpdateOptions();
                             break;
                    case 3 : getPatients();
                             break;
                    case 4 : deletePatient();
                             break;
                }
            }else {
                break;
            }
        }
    }

    private void hospitalFetchOptions(){
        while (true){
            System.out.println("Please provide the option from the menu below");
            System.out.println("1 -> Get Attender Name \n" +
                    "2 -> Get Patient Gender \n" +
                    "3 -> Get Patient Age \n" +
                    "4 -> Get Patient Address \n" +
                    "5 -> Get Patient Blood Group \n" +
                    "6 -> Get Particular Patient Details \n" +
                    "7 -> Exit \n");

            int choice = sc.nextInt();
                if(choice < 7){
                    switch (choice){
                        case 1 : fetchAttenderName();
                            break;
                        case 2 : fetchGender();
                            break;
                        case 3 : fetchPatientAge();
                            break;
                        case 4 :  fetchPatientAddress();
                            break;
                        case 5 : fetchPatientBloodGroup();
                            break;
                        case 6 : fetchPatientDetails();
                            break;
                    }
                }else {
                    break;
                }
        }
    }

    private void hospitalUpdateOptions(){
        while (true){
            System.out.println("Please provide the option from the menu below");
            System.out.println("1 -> Update Patient Name \n" +
                    "2 -> Update Patient Age \n" +
                    "3 -> Update Ward Number\n" +
                    "4 -> Update Gender\n" +
                    "5 -> Update Contact Number\n" +
                    "6 -> Update Address\n" +
                    "7 -> Update Attender Name\n" +
                    "8 -> Update Consultant Name\n" +
                    "9 -> Update Fees\n" +
                    "10 -> Exit");

            int choice = sc.nextInt();
            if(choice < 10){
                switch (choice){
                    case 1 : updateName();
                        break;
                    case 2 : updateAge();
                        break;
                    case 3 : updateWardNumber();
                        break;
                    case 4 : updateGender();
                        break;
                    case 5 : updateContactNumber();
                        break;
                    case 6 : updateAddress();
                        break;
                    case 7 : updateAttenderName();
                        break;
                    case 8 : updateConsultantName();
                        break;
                    case 9 : updateFees();
                        break;
                }
                getPatients();
            }else {
                break;
            }
        }
    }

    private void fetchAttenderName(){
        System.out.println("Enter the patients ID : ");
        System.out.println(getPatientsAttenderNameByPatientsID(sc.nextInt()));
    }

    private void fetchGender(){
        System.out.println("Enter the patients name : ");
        System.out.println(getPatientsGenderByPatientsName(sc.next()));
    }

    private void fetchPatientAge(){
        System.out.println("Enter the patients ID : ");
        System.out.println(getPatientsAgeByPatientsId(sc.nextInt()));
    }

    private void fetchPatientAddress(){
        System.out.println("Enter the patients name : ");
        System.out.println(getPatientsAddressByPatientsName(sc.next()));
    }

    private void fetchPatientBloodGroup(){
        System.out.println("Enter the patients name : ");
        System.out.println(getPatientsBloodGroupByPatientsName(sc.next()));
    }

    private void fetchPatientDetails(){
        System.out.println("Enter the patients ID : ");
        System.out.println(getPatientDetailsByPatientId(sc.nextInt()));
    }

    private String getPatientsAttenderNameByPatientsID(int id){
       for(PatientDTO patient : patients){
           if (patient.getPatientId() == id){
               return patient.getAttenderName();
           }
       }
       return "ID not found";
    }


    private Gender getPatientsGenderByPatientsName(String name){
       for (PatientDTO patient : patients){
           if (patient.getPatientName().equals(name.toLowerCase())){
               return patient.getGender();
           }
       }
        System.out.println("Not found");
       return null;
    }

    private int getPatientsAgeByPatientsId(int id){
        for(PatientDTO patient : patients){
            if (patient.getPatientId() == id){
                return patient.getAge();
            }
        }
        System.out.println("Not found");
        return 0;
    }

    private String getPatientsAddressByPatientsName(String name){
        for (PatientDTO patient : patients){
            if (patient.getPatientName().equals(name.toLowerCase())){
                return patient.getAddress();
            }
        }
        System.out.println("Not found");
        return null;
    }

    private BloodGroup getPatientsBloodGroupByPatientsName(String name){
        for (PatientDTO patient : patients){
            if (patient.getPatientName().equals(name.toLowerCase())){
                return patient.getBloodGroup();
            }
        }
        System.out.println("Not found");
        return null;
    }

    private PatientDTO getPatientDetailsByPatientId(int id){
        for(PatientDTO patient : patients){
            if (patient.getPatientId() == id){
                return patient;
            }
        }
        System.out.println("Not found");
        return null;
    }

    private boolean getDetailsByPatientId(int id){
        for(PatientDTO patient : patients){
            if (patient.getPatientId() == id){
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }

    private String updatePatientAgeByPatientName(String patientName,int updatedAge){
       for (PatientDTO patient : patients){
           if (patient.getPatientName().equals(patientName)){
               patient.setAge(updatedAge);
               return "Age updated to : " + updatedAge + " for patient : " + patient.getPatientName();
           }
       }
       return "Patient not found";
    }

    private String updatePatientNameByPatientId(int patientId,String newName){
       for (PatientDTO patient : patients){
           if (patient.getPatientId() == patientId){
               patient.setPatientName(newName);
               return "Patient Name updated to : " + newName + " for patient Id : " + patient.getPatientId();
           }
       }
       return  "Patient not found";
    }

    private String updateWardNumberByPatientsId(int id,WardNumber wardNumber){
       for (PatientDTO patient : patients){
           if (patient.getPatientId() == id){
               patient.setWardNo(wardNumber);
               return "Patient Ward number updated to : " + wardNumber + " for patient Id : " + patient.getPatientId();
           }
       }
        return  "Patient not found";
    }

    private String updateGenderByPatientsId(int id,Gender gender){
       for (PatientDTO patient : patients){
           if (patient.getPatientId() == id){
               patient.setGender(gender);
               return "Patient Gender has been changed to : " + gender + " for patient Id : " + patient.getPatientId();
           }
       }
       return "Patient not found";
    }

    private String updateContactNoByPatientsId(int id,long contactNo){
       for (PatientDTO patient : patients){
           if (patient.getPatientId() == id){
               patient.setContactNo(contactNo);
               return "Patients Contact Number updated to : " + contactNo + " for patient Id : " + patient.getPatientId();
           }
       }
       return "Patient not found";
    }

    private String updateAddressByPatientsId(int id,String address){
        for (PatientDTO patient : patients){
            if (patient.getPatientId() == id){
                patient.setAddress(address);
                return "Patients address updated to : " + address + " for patient Id : " + patient.getPatientId();
            }
        }
        return "Patient not found";
    }

    private String updateAttenderNameByPatientsId(int id,String attenderName){
        for (PatientDTO patient : patients){
            if (patient.getPatientId() == id){
                patient.setAttenderName(attenderName);
                return "Patients attender has been changed to : " + attenderName + " for patient Id : " + patient.getPatientId();
            }
        }
        return "Patient not found";
    }

    private String updateConsultantNameByPatientsId(int id,String consultantName){
        for (PatientDTO patient : patients){
            if (patient.getPatientId() == id){
                patient.setConsultantName(consultantName);
                return "Patients consultant has been changed to : " + consultantName + " for patient Id : " + patient.getPatientId();
            }
        }
        return "Patient not found";
    }

    private String updateFeesByPatientsId(int id,double fees){
        for (PatientDTO patient : patients){
            if (patient.getPatientId() == id){
                patient.setFees(fees);
                return "Patients Contact Number updated to : " + fees + " for patient Id : " + patient.getPatientId();
            }
        }
        return "Patient not found";
    }

    private void updateAge(){
        System.out.println("Enter the patients name : ");
        String name = sc.next();
        System.out.println("Enter age to be updated : ");
        int age = sc.nextInt();
        if(age > 0) {
            System.out.println(updatePatientAgeByPatientName(name.toLowerCase(), age));
        } else {
            System.out.println("Age must be greater than 0 ");
        }
    }

    private void updateName(){
        System.out.println("Enter the patients Id : ");
        int id = sc.nextInt();
        System.out.println("Enter the patients new name : ");
        String name = sc.next();
        if (name != null){
            System.out.println(updatePatientNameByPatientId(id,name.toLowerCase()));
        }
    }

    private void updateWardNumber(){
        System.out.println("Enter the patients Id : ");
        int id = sc.nextInt();
        System.out.println("Enter the patients updated wardNo from the values below : ");
        for(WardNumber wardNumber : WardNumber.values()){
            System.out.print(wardNumber + ", ");
        }
        System.out.println();
        //System.out.println("[A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4]");
        WardNumber number = WardNumber.valueOf(sc.next().toUpperCase());
        System.out.println(updateWardNumberByPatientsId(id,number));
    }

    private void updateGender(){
        System.out.println("Enter the patients Id :");
        int id = sc.nextInt();
        System.out.println("Enter the patients updated gender from the values below : ");
        for(Gender gender : Gender.values()){
            System.out.print(gender + ", ");
        }
        System.out.println();
        //System.out.println("[MALE, FEMALE, TRANSGENDER, OTHERS]");
        Gender gender = Gender.valueOf(sc.next().toUpperCase());
        System.out.println(updateGenderByPatientsId(id,gender));
    }

    private void updateContactNumber(){
        System.out.println("Enter the patients Id : ");
        int id = sc.nextInt();
        System.out.println("Enter the new contact number :");
        long contactNo = sc.nextLong();
        if (contactNo != 0){
            System.out.println(updateContactNoByPatientsId(id,contactNo));
        }
    }

    private void updateAddress(){
        System.out.println("Enter the patients Id : ");
        int id = sc.nextInt();
        System.out.println("Enter the new address : ");
        String address = sc.next();
        if (address != null){
            System.out.println(updateAddressByPatientsId(id,address.toLowerCase()));
        }
    }

    private void updateAttenderName(){
        System.out.println("Enter the patients Id : ");
        int id = sc.nextInt();
        System.out.println("Enter the attender name : ");
        String attenderName = sc.next();
        if (attenderName != null){
            System.out.println(updateAttenderNameByPatientsId(id,attenderName.toLowerCase()));
        }
    }

    private void updateConsultantName(){
        System.out.println("Enter the patients Id : ");
        int id = sc.nextInt();
        System.out.println("Enter the consultant name : ");
        String consultant = sc.next();
        if (consultant != null){
            System.out.println(updateConsultantNameByPatientsId(id,consultant.toLowerCase()));
        }
    }

    private void updateFees(){
        System.out.println("Enter the patients Id : ");
        int id = sc.nextInt();
        System.out.println("Enter the fees :");
        double fees = sc.nextDouble();
        if (fees != 0){
            System.out.println(updateFeesByPatientsId(id,fees));
        }
    }

    private String deletePatientById(int id){
        int newIndex = 0;
        if(getDetailsByPatientId(id)){
            for (int i=0;i < index;i++){
                if (patients[i].getPatientId() == id){
                    System.out.println("Patient to be discharged : " + patients[i]);
                }
                if (!(patients[i].getPatientId() == id)){
                    patients[newIndex++] = patients[i];
                }
            }
            index--;
            patients = Arrays.copyOf(patients,patients.length-1);
            System.out.println(Arrays.toString(patients));
            return "Patient with Id : " + id + " has been discharged\n";
        }
        else{
            return "Patient not found\n";
        }
    }

    private void deletePatient(){
        System.out.println("Enter the patient Id to be discharged : ");
        int id = sc.nextInt();
        System.out.println(deletePatientById(id));
        getPatients();
    }
}

