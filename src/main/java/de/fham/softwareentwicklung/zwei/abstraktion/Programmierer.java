package de.fham.softwareentwicklung.zwei.abstraktion;

import java.time.LocalDate;

public class Programmierer extends Person {

    private int linesOfCode = 42;

    public Programmierer(String name, LocalDate birthdate) {

        super(name, birthdate);
    }

    @Override
    public String getJobTitle() {
        return "Programmierer";
    }

    public int getLinesOfCode() {
        return linesOfCode;
    }
}
