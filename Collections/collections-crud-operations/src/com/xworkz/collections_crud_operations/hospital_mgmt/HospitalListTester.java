package com.xworkz.collections_crud_operations.hospital_mgmt;

import com.xworkz.collections_crud_operations.hospital_mgmt.compartor.PatientAddressComparator;
import com.xworkz.collections_crud_operations.hospital_mgmt.compartor.PatientAgeComparator;
import com.xworkz.collections_crud_operations.hospital_mgmt.compartor.PatientContactNoComparator;
import com.xworkz.collections_crud_operations.hospital_mgmt.compartor.PatientNameComparator;
import com.xworkz.collections_crud_operations.hospital_mgmt.constants.BloodGroup;
import com.xworkz.collections_crud_operations.hospital_mgmt.constants.Gender;
import com.xworkz.collections_crud_operations.hospital_mgmt.constants.WardNumber;
import com.xworkz.collections_crud_operations.hospital_mgmt.dto.PatientDTO;

import java.util.*;
import java.util.stream.Collectors;

public class HospitalListTester {
    public static void main(String[] args) {
        List<PatientDTO> patients = new ArrayList<>();
        patients.add(new PatientDTO(2,"ullas", BloodGroup.APOS,11, Gender.MALE,"bangalore",1234567890,"pavan",1200,"apollo", WardNumber.C4,"cough","tejas"));
        patients.add(new PatientDTO(1,"tejas", BloodGroup.APOS,21, Gender.MALE,"hassan",984256782,"pavan",2500,"apollo", WardNumber.C4,"sugar","tejas"));
        patients.add(new PatientDTO(4,"gagan", BloodGroup.APOS,7, Gender.MALE,"mangalore",894603746,"pavan",6500,"apollo", WardNumber.C4,"salt","tejas"));
        patients.add(new PatientDTO(3,"sharan", BloodGroup.APOS,15, Gender.MALE,"mysore",998855662,"pavan",800,"apollo", WardNumber.C4,"spicy","tejas"));
        patients.add(new PatientDTO(5,"pavan", BloodGroup.APOS,13, Gender.MALE,"hubli",651238792,"pavan",3600,"apollo", WardNumber.C4,"sour","tejas"));
        System.out.println(patients);
        Collections.sort(patients);
        System.out.println(patients);
        Collections.sort(patients,new PatientNameComparator());
        System.out.println(patients);
        Collections.sort(patients,new PatientAgeComparator());
        System.out.println(patients);
        Collections.sort(patients,new PatientAddressComparator());
        System.out.println(patients);
        Collections.sort(patients,new PatientContactNoComparator());
        System.out.println(patients);
   // Java 8 features implementation
        System.out.println(patients.stream().sorted().collect(Collectors.toList()));
        System.out.println(patients.stream().sorted(Comparator.comparing(PatientDTO ::getDiseaseName)).collect(Collectors.toList()));//based on particular column
        System.out.println(patients.stream().sorted(Comparator.comparing(PatientDTO ::getAddress).reversed()).collect(Collectors.toList()));//in descending
        System.out.println(patients.stream().sorted(Comparator.comparing(PatientDTO ::getAge).reversed()).findFirst());// to find oldest person

        Set<PatientDTO> patients1 = new TreeSet<>();
        patients1.add(new PatientDTO(2,"ullas", BloodGroup.APOS,11, Gender.MALE,"bangalore",1234567890,"pavan",1200,"apollo", WardNumber.C4,"cough","tejas"));
        patients1.add(new PatientDTO(1,"tejas", BloodGroup.APOS,21, Gender.MALE,"hassan",984256782,"pavan",2500,"apollo", WardNumber.C4,"sugar","tejas"));
        patients1.add(new PatientDTO(4,"gagan", BloodGroup.APOS,7, Gender.MALE,"mangalore",894603746,"pavan",6500,"apollo", WardNumber.C4,"salt","tejas"));
        patients1.add(new PatientDTO(3,"sharan", BloodGroup.APOS,15, Gender.MALE,"mysore",998855662,"pavan",800,"apollo", WardNumber.C4,"spicy","tejas"));
        patients1.add(new PatientDTO(5,"pavan", BloodGroup.APOS,13, Gender.MALE,"hubli",651238792,"pavan",3600,"apollo", WardNumber.C4,"sour","tejas"));
        System.out.println(patients1);

        System.out.println("Using Iterator");
        Iterator<PatientDTO> itr =patients.iterator();
        while (itr.hasNext()){
            PatientDTO patientDTO = itr.next();
            System.out.print(patientDTO);
        }

    }
}
