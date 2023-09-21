package com.xworkz.exam_hallticket.hall_ticket;

import com.xworkz.exam_hallticket.exam.Exam;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HallTicket {
    private String studentName;
    private String usn;
    private String subName;
    private String subCode;
    private String branch;
    private int sem;
    private int fees;
    private boolean isFeesPaid;
    private boolean isPrincipalSign;
    private boolean isHallTicketGenerated;

    public HallTicket(String studentName,String usn,String subName,String subCode,String branch,int sem,int fees){
        this.studentName = studentName;
        this.usn = usn;
        this.branch = branch;
        this.subName = subName;
        this.subCode = subCode;
        this.sem = sem;
        this.fees = fees;
    }

    public boolean checkFeesPaid(){
        if (fees >= Exam.genFees){
            isFeesPaid = true;
            System.out.println("Fees has been paid");
        }else {
            System.out.println("Fees has not been paid.Pay the fees to continue");
        }
        return isFeesPaid;
    }

    public boolean generateHallTicket(){
        if(checkFeesPaid()){
            isHallTicketGenerated = true;
            System.out.println("Hall ticket generated.Please collect");
        }
        else {
            System.out.println("Pay the fees first to generate hall ticket");
        }
        return isHallTicketGenerated;
    }

    public boolean signedByPrincipal(){
        if(generateHallTicket()){
            isPrincipalSign = true;
            System.out.println("Signed by Principal.All the best.");
        }else{
            System.out.println("Pay fees and generate hall ticket to get signed by principal ");
        }
        return  isPrincipalSign;
    }

    public void payFees(int amount){
        if(amount >= fees){
            fees = amount;
            System.out.println("Fees paid now");
        }else {
            System.out.println("Amount should be greater than : " + Exam.genFees);
        }
    }

}
