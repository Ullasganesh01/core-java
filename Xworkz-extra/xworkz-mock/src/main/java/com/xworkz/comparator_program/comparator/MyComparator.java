package com.xworkz.comparator_program.comparator;

import com.xworkz.comparator_program.dto.UserDto;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        UserDto dto1 = (UserDto)o1;
        UserDto dto2 = (UserDto) o2;
        return dto1.getName().compareTo(dto2.getName());
    }
}
