package de.fham.softwareentwicklung.zwei.ploymorphie;

public class Runnable {

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("Student:");
        student.sayHello();

//        Überschreiben
        Programmierer person = new Programmierer();

        System.out.println("Programmierer:");
        person.sayHello();

//        Übeladen
        Dozent dozent = new Dozent();

        System.out.println("Dozent:");
        dozent.sayHello("liebe Studenten!");
    }
}
