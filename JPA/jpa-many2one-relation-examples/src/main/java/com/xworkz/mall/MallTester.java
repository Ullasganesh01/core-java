package com.xworkz.mall;

import com.xworkz.mall.dto.MallDto;
import com.xworkz.mall.dto.ShopsDto;
import com.xworkz.mall.repository.MallRepository;
import com.xworkz.mall.repository.impl.MallRepositoryImpl;
import com.xworkz.mall.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class MallTester {
    public static void main(String[] args) {
        MallRepository mallRepository = new MallRepositoryImpl();
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        ShopsDto shopsDto = new ShopsDto();
        shopsDto.setShopName("Nike");
        shopsDto.setShopType("Clothing");

        ShopsDto shopsDto1 = new ShopsDto();
        shopsDto1.setShopName("Adidas");
        shopsDto1.setShopType("Clothing");



        MallDto mallDto = new MallDto();
        mallDto.setMallName("Orion");
        mallDto.setLocation("Bengaluru");

        shopsDto.setMall(mallDto);
        shopsDto1.setMall(mallDto);

        List<ShopsDto> shopList = new ArrayList<>();
        shopList.add(shopsDto);
        shopList.add(shopsDto1);
        mallDto.setShops(shopList);

        mallRepository.addMall(mallDto);
    }
}
