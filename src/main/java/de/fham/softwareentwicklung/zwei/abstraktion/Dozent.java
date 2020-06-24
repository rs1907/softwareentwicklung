package de.fham.softwareentwicklung.zwei.abstraktion;

import java.time.LocalDate;

public class Dozent extends Person {

    private String[] lectures = {"Softwareentwicklung", "Software Craftsmanship"};

    public Dozent(String name, LocalDate birthdate) {
        super(name, birthdate);
    }

    @Override
    public String getJobTitle() {
        return "Dozent";
    }

    public String[] getLectures() {
        return lectures;
    }
}
