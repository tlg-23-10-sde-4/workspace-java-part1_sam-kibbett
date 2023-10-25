package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    public double salary;

    public SalariedEmployee() {
      // super(); is always here automatically
    }



    @Override
    public void pay() {
        // opposed to hourly pay salary is just in sout and not a local variable
        System.out.println(getName() + " is paid " + salary + " for being salary");
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
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
        return super.toString() + ", Salary=" + getSalary();
    }
}