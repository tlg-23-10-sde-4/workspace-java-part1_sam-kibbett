package org.human;

import java.time.LocalDate;
import java.time.Period;

class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


    public int getAge() {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();

    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name=%s, birthDate=%s", getName(), getBirthDate());
    }
}