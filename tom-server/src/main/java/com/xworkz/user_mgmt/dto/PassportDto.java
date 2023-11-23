package com.xworkz.user_mgmt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "passport_reg")
public class PassportDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cpv_location")
    private String cpvLocation;
    @Column(name = "pass_off_loc")
    private String passportOfficeLoc;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "email")
    private String email;
    @Column(name = "login_id")
    private String loginId;
    @Column(name = "password")
    private String password;
    @Transient
    @Column(name = "confirmPwd")
    private String confirmPwd;
    @Column(name = "hint_ques")
    private String hintQuestion;
    @Column(name = "hint_ans")
    private String hintAnswer;
}
