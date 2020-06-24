package de.fham.softwareentwicklung.zwei.ploymorphie;

public class Programmierer extends Person {

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Welt");
    }
}
