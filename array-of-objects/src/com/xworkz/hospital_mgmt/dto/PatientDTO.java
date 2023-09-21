package com.xworkz.hospital_mgmt.dto;

import com.xworkz.hospital_mgmt.constants.BloodGroup;
import com.xworkz.hospital_mgmt.constants.Gender;
import com.xworkz.hospital_mgmt.constants.WardNumber;

import lombok.*;

import java.util.Objects;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class PatientDTO implements Comparable<PatientDTO>{
    //public static int id;
    private int patientId;
    private String patientName;
    private BloodGroup bloodGroup;
    private int age;
    private Gender gender;
    private String address;
    private long contactNo;
    private String attenderName;
    private double fees;
    private String hospitalName;
    private WardNumber wardNo;
    private String diseaseName;
    private String consultantName;

    @Override
    public String toString() {
        return "PatientDTO{" +
                "patientId : " + patientId +
                ", patientName : '" + patientName + '\'' +
                ", bloodGroup : '" + bloodGroup + '\'' +
                ", age : " + age +
                ", gender : '" + gender + '\'' +
                ", address : '" + address + '\'' +
                ", contactNo : " + contactNo +
                ", attenderName : '" + attenderName + '\'' +
                ", fees : " + fees +
                ", hospitalName : '" + hospitalName + '\'' +
                ", wardNo : '" + wardNo + '\'' +
                ", diseaseName : '" + diseaseName + '\'' +
                ", consultantName : '" + consultantName + '\'' +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PatientDTO)) return false;
        PatientDTO that = (PatientDTO) o;
        return hashCode() == that.hashCode() && getAge() == that.getAge() && getContactNo() == that.getContactNo() && Double.compare(that.getFees(), getFees()) == 0 && Objects.equals(getPatientName(), that.getPatientName()) && getBloodGroup() == that.getBloodGroup() && getGender() == that.getGender() && Objects.equals(getAddress(), that.getAddress()) && Objects.equals(getAttenderName(), that.getAttenderName()) && Objects.equals(getHospitalName(), that.getHospitalName()) && getWardNo() == that.getWardNo() && Objects.equals(getDiseaseName(), that.getDiseaseName()) && Objects.equals(getConsultantName(), that.getConsultantName());
    }

    @Override
    public int hashCode() {
        return patientId;
    }

// to sort data
    @Override
    public int compareTo(PatientDTO o) {
        return this.patientId - o.patientId;
    }
}



/*
 A composition is a form of Association.
 Association is the relation between two separate classes which establishes through their Objects.
 Has-a is a special form of Association where It is a unidirectional association -- aggregation
 Composition and Aggregation are the two forms of association.
 In composition, both entities are dependent on each other.
 In Aggregation, both the entries can survive individually which means ending one entity will not affect the other entity.
 When there is a composition between two entities, the composed object cannot exist without the other entity.
 Aggregation relation is “has-a” and composition is “part-of” relation
 Composition is a strong Association whereas Aggregation is a weak Association.
 */