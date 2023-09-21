package com.xworkz.engineer_branches;

import com.xworkz.engineer_branches.aerospace_engg.AerospaceEngineer;
import com.xworkz.engineer_branches.agriculture_engg.AgriculturalEngineer;
import com.xworkz.engineer_branches.chemical_engg.ChemicalEngineer;
import com.xworkz.engineer_branches.civil_engg.CivilEngineer;
import com.xworkz.engineer_branches.computer_science_engg.ComputerEngineer;
import com.xworkz.engineer_branches.electronics_engg.ElectronicsEngineer;
import com.xworkz.engineer_branches.engineer.Engineer;
import com.xworkz.engineer_branches.info_science_engg.InformationEngineer;
import com.xworkz.engineer_branches.marine_engg.MarineEngineer;
import com.xworkz.engineer_branches.petroleum_engg.PetroleumEngineer;

public class EngineerBranchTester {
    public static void main(String[] args) {
        /* crt
        Engineer engineer = new Engineer();
        engineer.solve();
        System.out.println();

        ComputerEngineer computerEngineer = new ComputerEngineer();
        computerEngineer.solve();
        computerEngineer.develop();
        System.out.println();

        Engineer engineer1 = new ComputerEngineer();
        engineer1.solve();
        System.out.println();


        Engineer engineer2 = computerEngineer;
        engineer2.solve();
        //System.out.println(engineer2.getClass());
        System.out.println();

        ComputerEngineer computerEngineer1 = (ComputerEngineer) engineer1;
        computerEngineer1.solve();
        computerEngineer1.develop();
        System.out.println();
        crt*/

        /*crt
        Engineer engineer3 = new CivilEngineer();
        engineer3.solve();
        System.out.println();

        CivilEngineer civilEngineer = new CivilEngineer();
        civilEngineer.solve();
        civilEngineer.construct();
        System.out.println();

        CivilEngineer civilEngineer1 = (CivilEngineer) engineer3;
        civilEngineer1.solve();
        civilEngineer1.construct();
        System.out.println();
        crt*/

        Engineer engineer4 = new Engineer();
        engineer4.solve();
        System.out.println(engineer4.getClass());
        System.out.println();

        MarineEngineer marineEngineer = new MarineEngineer();
        marineEngineer.solve();
        marineEngineer.design();
        System.out.println(marineEngineer.getClass());
        System.out.println();

        Engineer engineer5 = new MarineEngineer();
        engineer5.solve();
        System.out.println(engineer5.getClass());
        System.out.println();

        Engineer e3 = (Engineer) marineEngineer;
        e3.solve();
        System.out.println(e3.getClass());
        System.out.println();

        //PetroleumEngineer p4 = (Engineer) marineEngineer; compile error

        //PetroleumEngineer p5 = (MarineEngineer) marineEngineer; compile error

       /*run time error
        PetroleumEngineer p3 = (PetroleumEngineer) marineEngineer;
        p3.solve();
        p3.design();
        p3.produce();
        System.out.println(p3.getClass());
        System.out.println();

        MarineEngineer m1 = (MarineEngineer) engineer4;
        m1.solve();
        m1.design();
        System.out.println(m1.getClass());
        System.out.println();
        error*/

        //same as line 68 -- engineer5 no error redundant casting
        Engineer engineer6 = (Engineer) engineer5;
        engineer6.solve();
        System.out.println(engineer6.getClass());
        System.out.println();
        //*/
        
        // MarineEngineer m1 = (Engineer) engineer5;

        // PetroleumEngineer p1 = (Engineer) engineer5; compile error

        Engineer e2 = (MarineEngineer) engineer5;
        e2.solve();
        System.out.println(e2.getClass());
        System.out.println();

        MarineEngineer marineEngineer1 = (MarineEngineer)  engineer5;
        marineEngineer1.solve();
        marineEngineer1.design();
        System.out.println(marineEngineer1.getClass());
        System.out.println();

        // PetroleumEngineer p1 = (MarineEngineer) engineer5; compile error


        /*error runtime
        Engineer e1 = (PetroleumEngineer) engineer5;
        e1.solve();
        System.out.println(e1.getClass());
        System.out.println();


        MarineEngineer marineEngineer7 = (PetroleumEngineer) engineer5;
        marineEngineer7.solve();
        marineEngineer7.design();
        System.out.println(marineEngineer7.getClass());
        System.out.println();


        PetroleumEngineer petroleumEngineer = (PetroleumEngineer) engineer5;
        petroleumEngineer.solve();
        petroleumEngineer.design();
        petroleumEngineer.produce();
        System.out.println(petroleumEngineer.getClass());
        System.out.println();
        error */


        PetroleumEngineer petroleumEngineer1 = new PetroleumEngineer();
        petroleumEngineer1.solve();
        petroleumEngineer1.produce();
        petroleumEngineer1.design();
        System.out.println(petroleumEngineer1.getClass());
        System.out.println();

        MarineEngineer marineEngineer2 = new PetroleumEngineer();
        marineEngineer2.solve();
        marineEngineer2.design();
        System.out.println(marineEngineer2.getClass());
        System.out.println();

        Engineer engineer7 = new PetroleumEngineer();
        engineer7.solve();
        System.out.println(engineer7.getClass());
        System.out.println();

        Engineer engineer8 = (Engineer) marineEngineer2;
        engineer8.solve();
        System.out.println(engineer8.getClass());
        System.out.println();

        MarineEngineer marineEngineer3 = (MarineEngineer) marineEngineer2;
        marineEngineer3.solve();
        marineEngineer3.design();
        System.out.println(marineEngineer3.getClass());
        System.out.println();

        MarineEngineer marineEngineer4 = (PetroleumEngineer) marineEngineer2;
        marineEngineer4.solve();
        marineEngineer4.design();
        System.out.println(marineEngineer4.getClass());
        System.out.println();

        //PetroleumEngineer petroleumEngineer3 = (Engineer) marineEngineer2; compile time error
        // PetroleumEngineer petroleumEngineer3 = (MarineEngineer) marineEngineer2; compile time error

        PetroleumEngineer petroleumEngineer2 =(PetroleumEngineer) marineEngineer2;
        petroleumEngineer2.solve();
        petroleumEngineer2.design();
        petroleumEngineer2.produce();
        System.out.println(petroleumEngineer2.getClass());
        System.out.println();

        Engineer engineer9 = (Engineer) engineer7;
        engineer9.solve();
        System.out.println(engineer9.getClass());
        System.out.println();

        //MarineEngineer marineEngineer5 = (Engineer) engineer7; compile time error

        MarineEngineer marineEngineer6 = (MarineEngineer) engineer7;
        marineEngineer6.solve();
        marineEngineer6.design();
        System.out.println(marineEngineer6.getClass());
        System.out.println();

        MarineEngineer marineEngineer5 = (PetroleumEngineer) engineer7;
        marineEngineer5.solve();
        marineEngineer5.design();
        System.out.println(marineEngineer5.getClass());
        System.out.println();

        //PetroleumEngineer petroleumEngineer4 = (Engineer) engineer7; compile time error

        //PetroleumEngineer petroleumEngineer5 = (MarineEngineer) engineer7; compile time error

        PetroleumEngineer petroleumEngineer6 = (PetroleumEngineer) engineer7;
        petroleumEngineer6.solve();
        petroleumEngineer6.design();
        petroleumEngineer6.produce();
        System.out.println(petroleumEngineer6.getClass());
        System.out.println();


       /* error
       MarineEngineer marineEngineer5 = (MarineEngineer) engineer6;
        marineEngineer5.solve();
        marineEngineer5.design();
        System.out.println(marineEngineer5.getClass());
        System.out.println();

        PetroleumEngineer petroleumEngineer3 = (PetroleumEngineer) engineer6;
        petroleumEngineer3.solve();
        petroleumEngineer3.produce();
        petroleumEngineer3.design();
        System.out.println(petroleumEngineer3.getClass());
        System.out.println();

        MarineEngineer marineEngineer6 = (PetroleumEngineer) engineer6;
        marineEngineer6.solve();
        marineEngineer6.design();
        System.out.println(marineEngineer6.getClass());
        System.out.println();
        error */
        /*
        MarineEngineer marineEngineer1 = (PetroleumEngineer) engineer3;
        marineEngineer1.solve();
        marineEngineer1.design();
        System.out.println(marineEngineer1.getClass());
        System.out.println();

        PetroleumEngineer petroleumEngineer1 = (PetroleumEngineer) marineEngineer1;
        petroleumEngineer1.solve();
        petroleumEngineer1.produce();
        petroleumEngineer1.design();
        System.out.println(petroleumEngineer1.getClass());
        System.out.println();

        PetroleumEngineer petroleumEngineer2 = (PetroleumEngineer) engineer3;
        petroleumEngineer2.solve();
        petroleumEngineer2.design();
        petroleumEngineer2.produce();
        System.out.println(petroleumEngineer2.getClass());
        System.out.println();

        MarineEngineer marineEngineer3 = (MarineEngineer) engineer3;
        marineEngineer3.solve();
        marineEngineer3.design();
        System.out.println(marineEngineer3.getClass());
        System.out.println();



        //MarineEngineer marineEngineer3 = (PetroleumEngineer) engineer5; run time error
        MarineEngineer marineEngineer4 = (MarineEngineer) engineer5;
        marineEngineer4.solve();
        marineEngineer4.design();
        System.out.println(marineEngineer4.getClass());
        System.out.println();

        //PetroleumEngineer petroleumEngineer2 = (PetroleumEngineer) engineer5; run time error



       */
    }
}
