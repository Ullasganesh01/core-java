package com.xworkz.engineer_branches.mechanical_engg;

import com.xworkz.engineer_branches.engineer.Engineer;

public class MechanicalEngineer extends Engineer {
    @Override
    public void solve() {
        System.out.println("I solve problems related to machine and its parts");
    }

    public void manufacture(){
        System.out.println("I design and manufacture machine parts");
    }
}
