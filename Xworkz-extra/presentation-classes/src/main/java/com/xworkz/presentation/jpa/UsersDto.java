package com.xworkz.presentation.jpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@NamedQuery(name = "fetchAllUsers",query = "select dto from UsersDto as dto")
@Entity
@Table(name = "users")
public class UsersDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
