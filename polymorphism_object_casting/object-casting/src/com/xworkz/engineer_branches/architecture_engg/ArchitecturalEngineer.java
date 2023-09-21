package com.xworkz.engineer_branches.architecture_engg;

import com.xworkz.engineer_branches.engineer.Engineer;

public class ArchitecturalEngineer extends Engineer {
    @Override
    public void solve() {
        System.out.println("I solve problems related to structure of the buildings");
    }

    public void plan(){
        System.out.println("I plan how the buildings should be built");
    }
}
