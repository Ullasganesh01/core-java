package com.xworkz.comparator_program;

import com.xworkz.comparator_program.comparator.MyComparator;
import com.xworkz.comparator_program.dto.UserDto;

import java.util.Collection;
import java.util.TreeSet;

public class Executor {
    public static void main(String[] args) {
        MyComparator comparator = new MyComparator();
        TreeSet<UserDto> userSet = new TreeSet<UserDto>(comparator);

        UserDto dto = new UserDto();
        dto.setId(1);
        dto.setName("Ullas");
        dto.setAge(22);
        dto.setEmailId("ullasganesh18@gmail.com");
        dto.setPhoneNo(1234567890);

        userSet.add(dto);

        dto = new UserDto();
        dto.setId(3);
        dto.setName("Tejas");
        dto.setAge(23);
        dto.setEmailId("Tejas@gmail.com");

        userSet.add(dto);

        dto = new UserDto();
        dto.setId(4);
        dto.setName("Sharan");
        dto.setAge(24);
        dto.setEmailId("sharan@gmail.com");

        userSet.add(dto);

        dto = new UserDto();
        dto.setId(2);
        dto.setName("Pavan");
        dto.setAge(26);
        dto.setEmailId("pavan@gmail.com");

        userSet.add(dto);

        dto = new UserDto();
        dto.setId(5);
        dto.setName("Gagan");
        dto.setAge(23);
        dto.setEmailId("gagan@gmail.com");

        userSet.add(dto);

        for (UserDto dto1 : userSet){
            System.out.println(dto1);
        }
    }
}
