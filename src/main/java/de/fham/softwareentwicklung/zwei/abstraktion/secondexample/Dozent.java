package de.fham.softwareentwicklung.zwei.abstraktion.secondexample;

import java.time.LocalDate;

public class Dozent extends Person {


    private String[] lectures = {"Softwareentwicklung", "Software Craftsmanship"};

    public Dozent(String name, LocalDate birthdate) {
        super(name, birthdate);
    }

    public String[] getLectures() {
        return lectures;
    }
}
