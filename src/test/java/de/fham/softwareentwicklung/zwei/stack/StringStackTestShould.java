package de.fham.softwareentwicklung.zwei.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringStackTestShould {

    private StackInterface stack;

    @BeforeEach
    void setUp() {
        stack = new StringStack();
    }

    @Test
    void returnTrueForStackWithElements() {
        stack.push("Element");

        assertThat(stack.isEmpty()).isFalse();
    }

    @Test
    void returnFalseWhenStackIsEmpty() {
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    void pushAddsElementsInLiFo() {
        stack.push("1");
        stack.push("2");

        assertThat(stack.pop()).isEqualTo("2");
    }

    @Test
    void popsRemovesElementsInLiFo() {
        stack.push("1");
        stack.push("2");
        stack.pop();

        assertThat(stack.pop()).isEqualTo("1");
    }


}
