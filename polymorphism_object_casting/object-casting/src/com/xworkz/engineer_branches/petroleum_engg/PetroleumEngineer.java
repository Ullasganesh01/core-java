package com.xworkz.engineer_branches.petroleum_engg;

import com.xworkz.engineer_branches.engineer.Engineer;
import com.xworkz.engineer_branches.marine_engg.MarineEngineer;

public class PetroleumEngineer extends MarineEngineer {
    @Override
    public void solve() {
        System.out.println("I solve problems related to production of petrochemicals");
    }

    public void produce(){
        System.out.println("I provide plans to produce petroleum through different ways or methods");
    }
}
