package com.xworkz.presentation.jdbc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsersDto {
    private int id;
    private String userName;
    private long phoneNumber;
    private String emailId;
    private String password;
    private int age;

    @Override
    public String toString() {
        return "UsersDto{" +
                "id : " + id +
                ", userName : '" + userName + '\'' +
                ", phoneNumber : " + phoneNumber +
                ", emailId : '" + emailId + '\'' +
                ", password : '" + password + '\'' +
                ", age : " + age +
                '}';
    }
}
