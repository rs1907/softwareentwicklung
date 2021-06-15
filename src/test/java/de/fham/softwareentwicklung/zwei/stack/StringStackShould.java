package de.fham.softwareentwicklung.zwei.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringStackShould {

    StackInterface stackInterface;

    @BeforeEach
    void setUp() {
        stackInterface = new StringStack();
    }

    @Test
    public void checkThatTheInitialStackIsEmpty() throws Exception {
        if (stackInterface.isEmpty()) {
            System.out.println("The initial stack is Empty Yeay!");
        } else {
            System.out.println("Nope, please try again");
            throw new Exception("Nope, please try again");
        }
    }

    @Test
    public void checkThatAStackWithElementsIsNotEmpty() throws Exception {
        stackInterface.push("An Element");

        if (stackInterface.isEmpty()) {
            System.out.println("Nope, please try again");
            throw new Exception("Nope, please try again");
        } else {
            System.out.println("The stack is not empty!");
        }
    }

    @Test
    void returnTheElementsInLiFoOrder() {
        stackInterface.push("First Element");
        stackInterface.push("Second Element");

        if (stackInterface.pop() == "Second Element") {
            System.out.println("This should be true!");
        } else {
            System.out.println("nope please try again!");
        }
    }

    @Test
    void removesTheElementsInLiFoOrder() {
        stackInterface.push("First Element");
        stackInterface.push("Second Element");

        stackInterface.pop();
        stackInterface.pop();

        if (stackInterface.isEmpty()) {
            System.out.println("Works as expected");
        } else {
            System.out.println("Nope this is not the expected behaviour");
        }


    }
}
