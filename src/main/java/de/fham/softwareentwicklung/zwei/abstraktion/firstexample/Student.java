package de.fham.softwareentwicklung.zwei.abstraktion.firstexample;

public class Student extends Person {

    public Student(int age) {
        super(age);
    }

    public void takeExam(Task[] tasks) {
        for (int i = 0; i < tasks.length; i++) {
            Task currentTask = tasks[i];
            System.out.println("Working on Exam Number: " + currentTask.examNumber);
        }
    }
}
