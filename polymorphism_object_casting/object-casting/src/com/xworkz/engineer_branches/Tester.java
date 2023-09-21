package com.xworkz.engineer_branches;

import com.xworkz.engineer_branches.engineer.Engineer;
import com.xworkz.engineer_branches.marine_engg.MarineEngineer;
import com.xworkz.engineer_branches.petroleum_engg.PetroleumEngineer;

public class Tester {

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.solve();
        System.out.println(engineer.getClass());
        System.out.println();

        //MarineEngineer m11 = (Engineer) engineer; compile error
        /* run time error
        MarineEngineer m12 = (MarineEngineer) engineer;
        m12.solve();
        m12.design();
        System.out.println(m12.getClass());
        System.out.println();

        MarineEngineer m13 = (PetroleumEngineer) engineer;
        m13.solve();
        m13.design();
        System.out.println(m13.getClass());
        System.out.println();

        Engineer e11 = (MarineEngineer) engineer;
        e11.solve();
        System.out.println(e11.getClass());
        System.out.println();

        Engineer e12 = (PetroleumEngineer) engineer;
        e12.solve();
        System.out.println(e12.getClass());
        System.out.println();
        */
        //PetroleumEngineer p11 = (Engineer) engineer; compile time
        //PetroleumEngineer p12 = (MarineEngineer) engineer; compile time
        /* run time error
        PetroleumEngineer p13 = (PetroleumEngineer) engineer;
        p13.solve();
        p13.design();
        p13.produce();
        System.out.println(p13.getClass());
        System.out.println();
        */

        MarineEngineer marineEngineer = new MarineEngineer();
        marineEngineer.solve();
        marineEngineer.design();
        System.out.println(marineEngineer.getClass());
        System.out.println();

        //MarineEngineer m21 = (Engineer) marineEngineer; compile time
        //MarineEngineer m22 = (MarineEngineer) marineEngineer; same as line 50
        /* run time error
        MarineEngineer m23 = (PetroleumEngineer) marineEngineer;
        m23.solve();
        m23.design();
        System.out.println(m23.getClass());
        System.out.println();
        */

        Engineer e21 = (Engineer) marineEngineer;
        e21.solve();
        System.out.println(e21.getClass());
        System.out.println();

        Engineer e22 = (MarineEngineer) marineEngineer;
        e22.solve();
        System.out.println(e22.getClass());
        System.out.println();

        /* run time error
        Engineer e23 = (PetroleumEngineer) marineEngineer;
        e23.solve();
        System.out.println(e23.getClass());
        System.out.println();
        */

        //PetroleumEngineer p21 = (Engineer) marineEngineer; compile time
        //PetroleumEngineer p22 = (MarineEngineer) marineEngineer; compile time
        /* run time error
        PetroleumEngineer p23 = (PetroleumEngineer) marineEngineer;
        p23.solve();
        p23.design();
        p23.produce();
        System.out.println(p23.getClass());
        System.out.println();
        */

        PetroleumEngineer petroleumEngineer = new PetroleumEngineer();
        petroleumEngineer.solve();
        petroleumEngineer.design();
        petroleumEngineer.produce();
        System.out.println(petroleumEngineer.getClass());
        System.out.println();





        Engineer engineer1 = new MarineEngineer();
        engineer1.solve();
        System.out.println(engineer1.getClass());
        System.out.println();


    }
}
