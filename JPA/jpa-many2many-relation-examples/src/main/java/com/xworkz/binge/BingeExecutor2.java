package com.xworkz.binge;

import com.xworkz.binge.dto.BingeDto;
import com.xworkz.binge.dto.OttDto;
import com.xworkz.binge.singleton.EntityManagerFactorySingleton;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class BingeExecutor2 {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        OttDto ottDto = new OttDto();
        ottDto.setOttName("Prime");
        ottDto.setRatings(4);

        OttDto ottDto1 = new OttDto();
        ottDto1.setOttName("Netflix");
        ottDto1.setRatings(5);

        OttDto ottDto2 = new OttDto();
        ottDto2.setOttName("zee5");
        ottDto2.setRatings(3);

        List<OttDto> ottList = new ArrayList<>();
        ottList.add(ottDto);
        ottList.add(ottDto1);

        List<OttDto> ottList1 = new ArrayList<>();
        ottList1.add(ottDto2);
        ottList1.add(ottDto1);

        BingeDto bingeDto1 = new BingeDto();
        bingeDto1.setBingeName("TataPlay");
        bingeDto1.setPlanType("yearly");
        bingeDto1.setOtt(ottList);

        BingeDto bingeDto2 = new BingeDto();
        bingeDto2.setBingeName("Airtel");
        bingeDto2.setPlanType("monthly");
        bingeDto2.setOtt(ottList);

        BingeDto bingeDto3 = new BingeDto();
        bingeDto3.setBingeName("jio");
        bingeDto3.setPlanType("weekly");
        bingeDto3.setOtt(ottList1);

        List<BingeDto> bingeDtoList =new ArrayList<>();
        bingeDtoList.add(bingeDto1);
        bingeDtoList.add(bingeDto2);

        List<BingeDto> bingeDtoList1 =new ArrayList<>();
        bingeDtoList1.add(bingeDto2);
        bingeDtoList1.add(bingeDto3);

        ottDto.setBinge(bingeDtoList);
        ottDto1.setBinge(bingeDtoList1);

        em.getTransaction().begin();
        em.persist(bingeDto1);
        em.persist(bingeDto2);
        em.persist(bingeDto3);

        em.persist(ottDto);
        em.persist(ottDto1);
        em.persist(ottDto2);

        em.getTransaction().commit();

    }
}
