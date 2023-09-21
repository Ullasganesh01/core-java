package com.xworkz.exam_hallticket.supplymentary_exam;

import com.xworkz.exam_hallticket.exam.Exam;
import com.xworkz.exam_hallticket.hall_ticket.HallTicket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupplymentaryExam extends Exam {
    private int noOfAttempts = 2;
    //HallTicket ticket;

    /*public SupplymentaryExam(int noOfAttempts){
        this.noOfAttempts = noOfAttempts;
    }*/

    @Override
    public void allowStudent(HallTicket ticket){
        //this.ticket = ticket;
        System.out.println("Inside child");
        if(noOfAttempts > 1) {
            //this.ticket = ticket;
            super.allowStudent(ticket);
        }else {
            System.out.println("Student must have failed atleast once \n");
        }
    }


}
