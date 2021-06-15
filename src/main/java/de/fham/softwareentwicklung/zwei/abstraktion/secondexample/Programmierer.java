package de.fham.softwareentwicklung.zwei.abstraktion.secondexample;

import java.time.LocalDate;

public class Programmierer extends Person {

    private int linesOfCode = 42;

    public Programmierer(String name, LocalDate birthdate) {

        super(name, birthdate);
    }

    public int getLinesOfCode() {
        return linesOfCode;
    }
}
