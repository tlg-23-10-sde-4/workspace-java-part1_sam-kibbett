package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    public double salary;

    public SalariedEmployee() {

    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee: name=" + getName() + ", hireDate=" + getHireDate() + ", Salary=" + getSalary();
    }
}