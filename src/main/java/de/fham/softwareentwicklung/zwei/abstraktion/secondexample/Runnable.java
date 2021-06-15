package de.fham.softwareentwicklung.zwei.abstraktion.secondexample;

import java.time.LocalDate;

public class Runnable {

    public static void main(String[] args) {
        Person person = new Programmierer("Chris", LocalDate.of(1989, 9, 20));

        System.out.println("Name: " + person.getName());
        System.out.println("Birthday: " + person.getBirthday());

        person = new Dozent(person.getName(), person.getBirthday());

        if (person instanceof Programmierer) {
            System.out.println("Written LoC:" + ((Programmierer) person).getLinesOfCode());
        }

        if (person instanceof Dozent) {
            for (String lecture : ((Dozent) person).getLectures()) {
                System.out.println("Lectures: " + lecture);
            }
        }
    }
}
