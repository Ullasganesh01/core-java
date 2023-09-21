package com.xworkz.dto_examples_object_class_methods.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDTO {
    private int rollNumber;
    private String studentName;
    private int classNumber;

    @Override
    public String toString() {
        return "StudentDTO{rollNumber = " + rollNumber + ", studentName = " + studentName + ", classNumber = " + classNumber + '}';
    }

    @Override
    public int hashCode() {
        return rollNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof StudentDTO){
            StudentDTO studentDTO = (StudentDTO) obj;
            if ((this.hashCode() == studentDTO.hashCode()) && (this.getStudentName().equals(studentDTO.getStudentName())) && (this.getClassNumber()==studentDTO.getClassNumber()))
                return true;
        }
        return false;
    }
}
