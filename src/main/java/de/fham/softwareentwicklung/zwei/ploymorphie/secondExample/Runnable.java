package de.fham.softwareentwicklung.zwei.ploymorphie.secondExample;

public class Runnable {

    public static void main(String[] args) {

        Student student = new Student();
        student.sayHello();

//        Überschreiben
        Programmierer person = new Programmierer();

        Dozent dozent = new Dozent();
//        Übeladen
        person.sayHello();
        dozent.sayHello("liebe Studenten!");
    }
}
