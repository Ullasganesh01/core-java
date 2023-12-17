package com.xworkz.mall.repository;

import com.xworkz.mall.dto.MallDto;
import com.xworkz.mall.dto.ShopsDto;

public interface MallRepository {
    void addMall(MallDto dto);
    MallDto getMallInfoById(int id);
    ShopsDto getShopsInfoById(int id);
}
