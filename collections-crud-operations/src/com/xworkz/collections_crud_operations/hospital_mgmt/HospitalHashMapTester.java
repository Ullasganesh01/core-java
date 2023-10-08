package com.xworkz.collections_crud_operations.hospital_mgmt;

import com.xworkz.collections_crud_operations.hospital_mgmt.constants.BloodGroup;
import com.xworkz.collections_crud_operations.hospital_mgmt.constants.Gender;
import com.xworkz.collections_crud_operations.hospital_mgmt.constants.WardNumber;
import com.xworkz.collections_crud_operations.hospital_mgmt.dto.PatientDTO;

import java.net.ConnectException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HospitalHashMapTester {
    public static void main(String[] args) {
        PatientDTO p1 = new PatientDTO(2,"ullas", BloodGroup.APOS,11, Gender.MALE,"bangalore",1234567890,"pavan",1200,"apollo", WardNumber.C4,"cough","tejas");
        PatientDTO p2 =  new PatientDTO(1,"tejas", BloodGroup.APOS,21, Gender.MALE,"hassan",984256782,"pavan",2500,"apollo", WardNumber.C4,"sugar","tejas");
        PatientDTO p3 =  new PatientDTO(4,"gagan", BloodGroup.APOS,7, Gender.MALE,"mangalore",894603746,"pavan",6500,"apollo", WardNumber.C4,"salt","tejas");
        PatientDTO p4 =  new PatientDTO(3,"sharan", BloodGroup.APOS,15, Gender.MALE,"mysore",998855662,"pavan",800,"apollo", WardNumber.C4,"spicy","tejas");
        PatientDTO p5 =  new PatientDTO(5,"pavan", BloodGroup.APOS,13, Gender.MALE,"hubli",651238792,"pavan",3600,"apollo", WardNumber.C4,"sour","tejas");
        PatientDTO p6 = new PatientDTO(2,"ullas", BloodGroup.APOS,11, Gender.MALE,"bangalore",1234567890,"pavan",1200,"apollo", WardNumber.C4,"cough","tejas");


        Map<Integer, PatientDTO> patients = new HashMap<>();
        patients.put(p1.getPatientId(),p1);
        patients.put(p2.getPatientId(),p2);
        patients.put(p3.getPatientId(),p3);
        patients.put(p4.getPatientId(),p4);
        patients.put(p5.getPatientId(),p5);

        System.out.println(patients);//toString()

        System.out.println(patients.get(3));
        System.out.println(patients.keySet());
        System.out.println(patients.values());


        Set set = patients.entrySet();
        System.out.println(set);//toString()

        Set<Map.Entry<Integer,PatientDTO>> set1 = patients.entrySet();
        for (Map.Entry<Integer,PatientDTO> entry : set1){
            System.out.print(entry.getKey() + "   " + entry.getValue()); //forEach MapEntry using Entry Interface and its methods and entrySet()
        }
        System.out.println();

        System.out.println(set1);//toString()

        System.out.println("java 8");
        set1.stream().forEach(System.out::print);//using stream() - java 8 feature

        System.out.println("Iterator");
        Iterator<Map.Entry<Integer,PatientDTO>> itr = set1.iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,PatientDTO> entry = itr.next();
            System.out.println(entry.getKey() + "   " + entry.getValue());//using Iterator and Entry Interface
        }

        Map<PatientDTO, Integer> patients1 = new HashMap<>();
        patients1.put(p1,p1.getPatientId());
        patients1.put(p2,p2.getPatientId());
        patients1.put(p3,p3.getPatientId());
        patients1.put(p4,p4.getPatientId());
        patients1.put(p5,p5.getPatientId());
        patients1.put(p6, p6.getPatientId());
        System.out.println(patients1);

        //Set set2 = patients1.entrySet();
        Set<Map.Entry<PatientDTO,Integer>> set3 = patients1.entrySet();
        for (Map.Entry<PatientDTO,Integer> entry : set3){
            System.out.print(entry.getKey() + "   " + entry.getValue()); //forEach MapEntry using Entry Interface and its methods and entrySet()
        }
        System.out.println();
    }
}
