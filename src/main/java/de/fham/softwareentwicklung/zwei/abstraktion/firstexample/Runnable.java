package de.fham.softwareentwicklung.zwei.abstraktion.firstexample;

public class Runnable {

    public static void main(String[] args) {

        Student student = new Student(31);

        student.sayHello();

        System.out.println(student.getAge());

        Task task1 = new Task();
        task1.examNumber = "1";

        Task task2 = new Task();
        task2.examNumber = "2";

        Task[] exam = {task1, task2};

        student.takeExam(exam);

        Person person = new Student(31);

        if (person instanceof Student) {
            Student backAsAStudent = (Student) person;
            backAsAStudent.takeExam(exam);
        }

    }
}
