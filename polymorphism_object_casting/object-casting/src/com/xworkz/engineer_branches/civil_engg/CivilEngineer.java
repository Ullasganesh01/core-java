package com.xworkz.engineer_branches.civil_engg;

import com.xworkz.engineer_branches.engineer.Engineer;

public class CivilEngineer extends Engineer {
    /*@Override
    public void solve() {
        System.out.println("I solve problems related to construction of buildings");
    }*/
    @Override
    public void solve() {
        super.solve();
        System.out.println("I solve problems related to construction of buildings");
    }

    public void construct(){
        System.out.println("I construct buildings");
    }
}
