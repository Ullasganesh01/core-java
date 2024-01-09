package com.myworkz.java_features.streams;

public class EmployeeDto implements Comparable{
    private int empId;

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public EmployeeDto(int empId, String empName, String department, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    private String empName;
    private String department;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        EmployeeDto dto = (EmployeeDto) o;
         return this.empId-dto.empId;
    }
}
