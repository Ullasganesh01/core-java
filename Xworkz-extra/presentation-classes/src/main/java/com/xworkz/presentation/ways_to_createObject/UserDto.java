package com.xworkz.presentation.ways_to_createObject;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDto implements Cloneable, Serializable {
    private String name;
    private String address;
    private String gender;
    private long contactNo;
    private int age;
    @Override
    protected UserDto clone()
            throws CloneNotSupportedException
    {
        return (UserDto)super.clone();
    }
}
