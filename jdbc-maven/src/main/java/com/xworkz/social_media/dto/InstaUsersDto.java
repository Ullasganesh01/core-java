package com.xworkz.social_media.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InstaUsersDto {
    private int id;
    private String userName;
    private long phoneNumber;
    private String emailId;
    private String password;
    private int age;

    @Override
    public String toString() {
        return "InstaUsersDto{" +
                "id : " + id +
                ", userName : '" + userName + '\'' +
                ", phoneNumber : " + phoneNumber +
                ", emailId : '" + emailId + '\'' +
                ", password : '" + password + '\'' +
                ", age : " + age +
                '}';
    }
}
