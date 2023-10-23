package org.human;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Sam", LocalDate.of(1999, 01, 16));

        System.out.println(p1);

        System.out.println("%s is %s yeard old\n", p1.getName(), p1.getAge());
    }
}