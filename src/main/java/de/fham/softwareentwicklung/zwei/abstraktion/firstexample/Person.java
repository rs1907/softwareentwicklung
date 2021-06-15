package de.fham.softwareentwicklung.zwei.abstraktion.firstexample;

public abstract class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hallo!");
    }

    public int getAge() {
        return age;
    }
}
