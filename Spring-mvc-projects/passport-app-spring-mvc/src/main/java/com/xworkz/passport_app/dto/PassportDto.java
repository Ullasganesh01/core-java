package com.xworkz.passport_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "passport_reg")
@NamedQueries({
        @NamedQuery(name = "getUserByLoginIdAndPassword",query = "select dto from PassportDto dto where dto.loginId=: loginId and dto.password =: password "),
        @NamedQuery(name = "getLoginId",query = "select dto.loginId from PassportDto dto"),
        @NamedQuery(name = "getAllPassports",query = "from PassportDto dto"),
        @NamedQuery(name = "getPassportById",query = "from PassportDto dto where dto.id=:id"),
        @NamedQuery(name = "filterByFirstName",query = "from PassportDto dto where dto.firstName LIKE CONCAT('%',:firstName,'%') "),
        @NamedQuery(name = "filterByEmail",query = "from PassportDto dto where dto.email LIKE CONCAT('%',:email,'%') "),
        @NamedQuery(name = "filterByFirstNameAndEmail",query = "from PassportDto dto where dto.firstName LIKE CONCAT('%',:firstName,'%') OR dto.email LIKE CONCAT('%',:email,'%') ")
})
public class PassportDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cpv_location")
    @NotNull
    private String cpvLocation;

    @Column(name = "pass_off_loc")
    @NotNull
    private String passportOfficeLoc;

    @Column(name = "first_name")
    @NotNull
    @Size(min = 4,max = 10,message = "Length should be between 4 and 10 chars")
    private String firstName;

    @Column(name = "surname")
    @NotNull
    @Size(min = 2,max = 10,message = "Length should be between 2 and 10 chars")
    private String surname;

    @Column(name = "dob")
    @NotNull
    private String dob;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "login_id")
    @NotNull
    private String loginId;

    @Column(name = "password")
    @NotNull
    @Size(min = 8,max = 16,message = "Password Length should be between 8 and 16 chars")
    private String password;

    @Transient
    @Column(name = "confirmPwd")
//    @NotNull
//    @Size(min = 8,max = 16,message = "Password Length should be between 8 and 16 chars")
    private String confirmPwd;

    @Column(name = "hint_ques")
    @NotNull
    private String hintQuestion;

    @Column(name = "hint_ans")
    @NotNull
    @Size(min = 3,max = 10,message = "Length should be between 3 and 10 chars")
    private String hintAnswer;

}
