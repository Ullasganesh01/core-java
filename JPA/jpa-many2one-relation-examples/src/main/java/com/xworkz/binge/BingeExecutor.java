package com.xworkz.binge;

import com.xworkz.binge.dto.BingeDto;
import com.xworkz.binge.dto.OttDto;
import com.xworkz.binge.repository.BingeRepository;
import com.xworkz.binge.repository.impl.BingeRepositoryImpl;
import com.xworkz.binge.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class BingeExecutor {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        BingeRepository bingeRepository =  new BingeRepositoryImpl();

        BingeDto bingeDto = new BingeDto();
        List<OttDto> ottList = new ArrayList<>();

        OttDto ottDto = new OttDto();
        ottDto.setOttName("Prime");
        ottDto.setRatings(4);

        OttDto ottDto1 = new OttDto();
        ottDto1.setOttName("Netflix");
        ottDto1.setRatings(5);

        ottList.add(ottDto);
        ottList.add(ottDto1);

        bingeDto.setBingeName("TataPlay");
        bingeDto.setPlanType("yearly");
        //bingeDto.setOtt(ottList);

        em.getTransaction().begin();
        em.persist(bingeDto);

        ottDto.setBinge(bingeDto);
        ottDto1.setBinge(bingeDto);

        em.persist(ottDto);
        em.persist(ottDto1);

        em.getTransaction().commit();

        //bingeRepository.saveBinge(bingeDto);
    }
}
