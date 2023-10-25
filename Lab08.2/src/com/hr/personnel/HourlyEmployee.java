package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    public double rate;
    public double hours;

    public HourlyEmployee() {

    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    @Override
    public void pay() {
        // local variable used here but it could be in sout as rate * hours
        double payment = getRate() * getHours();
        System.out.println(" Fleet admiral love machine is paid " + payment + " To destroy ships");
    }


    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String toString() {
        return super.toString() + ", Rate:" + getRate() + ", hours=" + getHours();
    }
}