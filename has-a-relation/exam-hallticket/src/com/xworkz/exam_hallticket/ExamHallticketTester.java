package com.xworkz.exam_hallticket;

import com.xworkz.exam_hallticket.exam.Exam;
import com.xworkz.exam_hallticket.hall_ticket.HallTicket;
import com.xworkz.exam_hallticket.supplymentary_exam.SupplymentaryExam;

public class ExamHallticketTester {
    public static void main(String[] args) {
        HallTicket pavanHallTicket = new HallTicket("Pavan","1SG19IS030","AI ML","18CS71","ISE",7,1500);
        Exam exam = new Exam();
        exam.ticket = pavanHallTicket;
        exam.allowStudent();

        exam.ticket.payFees(1700);
        exam.allowStudent();


        HallTicket gaganHallTicket = new HallTicket("Gagan","1SG19IS060","Civil","18CS14","ISE",1,1560);
        exam.ticket = gaganHallTicket;
        exam.allowStudent();


        HallTicket sharanHallTicket = new HallTicket("Sharan","1SG19IS090","Maths","18CS21","ISE",2,1660);
        Exam exam1 = new Exam(sharanHallTicket);
        exam1.allowStudent();


        HallTicket tejasHallTicket = new HallTicket("Tejas","1SG19IS0110","DSA","18CS33","ISE",3,160);
        exam.allowStudent(tejasHallTicket);

        tejasHallTicket.payFees(1700);
        exam.allowStudent(tejasHallTicket);

        HallTicket ullasHallTicket = new HallTicket("Ullas","1SG19IS066","IOT","18CS81","ISE",8,1800,false,false,false);
        exam.allowStudent(ullasHallTicket);

        SupplymentaryExam supplymentaryExam = new SupplymentaryExam(2);
        supplymentaryExam.allowStudent(sharanHallTicket);

        Exam exam2 = new SupplymentaryExam();
        exam2.allowStudent(ullasHallTicket);


    }
}
