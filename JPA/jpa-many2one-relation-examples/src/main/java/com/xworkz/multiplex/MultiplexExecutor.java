package com.xworkz.multiplex;

import com.xworkz.multiplex.dto.MultiplexDto;
import com.xworkz.multiplex.dto.ScreensDto;
import com.xworkz.multiplex.repository.MultiplexRepository;
import com.xworkz.multiplex.repository.impl.MultiplexRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class MultiplexExecutor {
    public static void main(String[] args) {
        MultiplexRepository multiplexRepository = new MultiplexRepositoryImpl();

        ScreensDto screensDto = new ScreensDto();
        screensDto.setScreenNumber("Audi 1");
        screensDto.setMovieDisplayed("KGF");
        screensDto.setCapacity(500);

        ScreensDto screensDto1 = new ScreensDto();
        screensDto1.setScreenNumber("Audi 2");
        screensDto1.setMovieDisplayed("SSE 2");
        screensDto1.setCapacity(350);

        MultiplexDto multiplexDto = new MultiplexDto();
        multiplexDto.setName("INOX");
        multiplexDto.setLocation("Bengaluru");

        screensDto.setMultiplex(multiplexDto);
        screensDto1.setMultiplex(multiplexDto);

        List<ScreensDto> scrrenList = new ArrayList<>();
        scrrenList.add(screensDto);
        scrrenList.add(screensDto1);

        multiplexDto.setScreens(scrrenList);

        multiplexRepository.addMultiplex(multiplexDto);
    }
}
