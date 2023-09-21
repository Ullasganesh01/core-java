package com.xworkz.exam_hallticket.exam;

import com.xworkz.exam_hallticket.hall_ticket.HallTicket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Exam {
    public HallTicket ticket;
    public static final int genFees = 1560;


   // public Exam(HallTicket ticket){
   //     this.ticket = ticket;
   // }

    public boolean verifyStudent(){
        boolean isVerified = false;
        if(ticket != null){
            if(ticket.signedByPrincipal()){
                isVerified = true;
                System.out.println("Student is verified");
            }else {
                System.out.println("Get the hall ticket signed by principal");
            }
        }else {
            System.out.println("This is not hall ticket");
        }
        return isVerified;
    }

    public boolean verifyStudent(HallTicket ticket){
        /* boolean isVerified = false;
        if(ticket != null){
            if(ticket.signedByPrincipal()){
                isVerified = true;
                System.out.println("Student is verified");
            }else {
                System.out.println("Get the hall ticket signed by principal");
            }
        }else {
            System.out.println("This is not hall ticket");
        }
        return isVerified; */
        return verifyStudent();
    }

    public void allowStudent(){
        System.out.println("Inside parent");

        if(verifyStudent()){
            System.out.println("Student is allowed to write exam : " + ticket.getStudentName());
            printStudentDetails();
        }else {
            System.out.println("Student is not verified. Can't enter inside");
            System.out.println();
        }
    }

    public void allowStudent(HallTicket ticket){
        this.ticket = ticket;
        System.out.println("Inside parent");
       /* if(verifyStudent(this.ticket)){
            System.out.println("Student is allowed to write exam : " + ticket.getStudentName());
            printStudentDetails();
        }else {
            System.out.println("Student is not verified. Can't enter inside");
            System.out.println();
        } */
        allowStudent();
    }

    public void printStudentDetails(){
        System.out.println("Name : " + this.ticket.getStudentName());
        System.out.println("USN : " + this.ticket.getUsn());
        System.out.println("Branch : " + this.ticket.getBranch());
        System.out.println("Semester : " + this.ticket.getSem());
        System.out.println("Fees : " + this.ticket.getFees());
        System.out.println("Exam Fees paid : " + this.ticket.isFeesPaid());
        System.out.println();
    }

}
