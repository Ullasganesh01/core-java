package com.xworkz.dto_examples_object_class_methods.dto;

import com.xworkz.dto_examples_object_class_methods.constants.BloodGroup;
import com.xworkz.dto_examples_object_class_methods.constants.Gender;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode //Equality contract where it uses both equals and hashcode which are overridden
public class HospitalDTO {
    private String patientName;
    private int patientId;
    private Gender gender;
    private BloodGroup bloodGroup;

    @Override
    public String toString() {
        return "HospitalDTO[ Patient Name : " + patientName + ", Patient Id : " + patientId + ", Gender : " + gender +", Blood Group : " + bloodGroup + " ]";
    }

    @Override
    public int hashCode() {
        return patientId;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof HospitalDTO){
            HospitalDTO hospitalDTO = (HospitalDTO) obj;
            if ((this.hashCode() == hospitalDTO.hashCode()) && (this.getPatientName().equals(hospitalDTO.getPatientName())) && (this.getGender().equals(hospitalDTO.getGender())) && (this.getBloodGroup().equals(hospitalDTO.getBloodGroup())))
                return true;
        }
        return false;
    }
}
