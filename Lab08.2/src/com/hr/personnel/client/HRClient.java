/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept); // toString(Automatically called)

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason",                      LocalDate.of(1990, 8, 24), 252525));
        dept.addEmployee(new HourlyEmployee("Julie",                        LocalDate.of(2000, 2, 2), 2525, 2525));
        dept.addEmployee(new SalariedEmployee("Jackson",                    LocalDate.of(1999, 01, 14), 24));
        dept.addEmployee(new HourlyEmployee("Fleet Admiral Love Machine",   LocalDate.of(1491, 01, 14), 25, 12));
        dept.addEmployee(new Executive("Mike",                              LocalDate.of(1991, 01, 14), 99999));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("\nPay employees");
        dept.payEmployees();

        // forced holiday break
        System.out.println("\nForced holiday break");
        dept.holidayBreak();
    }
}