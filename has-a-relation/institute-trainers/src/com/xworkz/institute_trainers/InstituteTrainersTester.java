package com.xworkz.institute_trainers;

import com.xworkz.institute_trainers.institute.Institute;
import com.xworkz.institute_trainers.trainers.Trainer;

public class InstituteTrainersTester {
    public static void main(String[] args) {
        Institute institute = new Institute();
        Trainer trainer = new Trainer();
        institute.trainer = trainer;
    }


}
