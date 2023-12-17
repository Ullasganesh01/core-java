package com.xworkz.showroom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "users")
@NamedQueries({
        @NamedQuery(name = "getUserByUserNameAndPassword",query = "select dto from UserDto dto where dto.uName=: uName and dto.password =: password "),
        @NamedQuery(name = "getUserName",query = "select dto.uName from UserDto dto"),
        @NamedQuery(name = "getAllUsers",query = "from UserDto dto"),
        @NamedQuery(name = "getUserById",query = "from UserDto dto where dto.id=:id"),
})
public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "phone_no")
    private long pNumber;
    @Column(name = "user_name")
    private String uName;
    @Column(name = "password")
    private String password;
}
