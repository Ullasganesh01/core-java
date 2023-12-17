package com.xworkz.comparator_program.dto;

import java.util.Objects;

public class UserDto {
    private int id;
    private String name;
    private int age;
    private long phoneNo;
    private String emailId;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDto)) return false;
        UserDto userDto = (UserDto) o;
        return getId() == userDto.getId() && getAge() == userDto.getAge() && getPhoneNo() == userDto.getPhoneNo() && Objects.equals(getName(), userDto.getName()) && Objects.equals(getEmailId(), userDto.getEmailId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getPhoneNo(), getEmailId());
    }
}
