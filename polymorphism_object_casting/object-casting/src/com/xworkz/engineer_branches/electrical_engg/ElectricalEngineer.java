package com.xworkz.engineer_branches.electrical_engg;

import com.xworkz.engineer_branches.engineer.Engineer;

public class ElectricalEngineer extends Engineer {
    @Override
    public void solve() {
        System.out.println("I solve problems related to electricity");
    }

    public void provide(){
        System.out.println("I am responsible for providing electricity");
    }
}
