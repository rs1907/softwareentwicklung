package de.fham.softwareentwicklung.zwei.abstraktion.secondexample;

import java.time.LocalDate;

public abstract class Person {

    private String name;

    private LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public LocalDate getBirthday() {

        return birthdate;
    }

    public String getName() {

        return name;
    }
}
