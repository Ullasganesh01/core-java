package com.xworkz.presentation.ways_to_createObject;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateObject { // ways to create object
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IOException {
        UserDto dto = new UserDto();
        dto.setName("ullas");
        dto.setAge(22);
        dto.setAddress("bengaluru");
        dto.setContactNo(123456789l);
        dto.setGender("male");
        System.out.println(dto);

        UserDto dto1 = dto.clone();
        System.out.println(dto1);

        dto = (UserDto)Class.forName("com.xworkz.UserDto").newInstance();
        dto.setName("tejas");
        dto.setAge(23);
        dto.setAddress("bengaluru");
        dto.setContactNo(8904603746l);
        dto.setGender("male");
        System.out.println(dto);

        Constructor<UserDto> constructor = UserDto.class.getDeclaredConstructor();
        dto = constructor.newInstance();
        dto.setName("sharan");
        dto.setAge(24);
        dto.setAddress("bengaluru");
        dto.setContactNo(9113613238l);
        dto.setGender("male");
        System.out.println(dto);

        FileOutputStream f = new FileOutputStream("file.txt");
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(dto);
        o.close();
        f.close();

        FileInputStream f1 = new FileInputStream("file.txt");
        ObjectInputStream o1 = new ObjectInputStream(f1);
        dto = (UserDto) o1.readObject();
        System.out.println(dto);

    }
}
