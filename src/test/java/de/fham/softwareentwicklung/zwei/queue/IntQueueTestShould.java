package de.fham.softwareentwicklung.zwei.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class IntQueueTestShould {

    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new IntQueue();
    }

    @Test
    void returnElementsInFiFoOrder() {
        // Setup - Prepare the tast

        Queue queue = new IntQueue();
        queue.add(1);
        queue.add(2);

        // Execute
        int element = queue.element();

        // Validate
        assertThat(element).isEqualTo(1);
    }

    @Test
    void removeElementsInFiFoOrder() {
        queue.add(1);
        queue.add(2);

        queue.remove();
        assertThat(queue.element()).isEqualTo(2);
    }

    @Test
    void throwsEmptyQueueExceptionWhenRemoveFromEmptyQueue() {
        assertThatThrownBy(() -> queue.remove()).isInstanceOf(EmptyQueueException.class);
    }

    @Test
    void throwsEmptyQueueExceptionWhenGetElementFromEmptyQueue() {
        assertThatThrownBy(() -> queue.element()).isInstanceOf(EmptyQueueException.class);
    }
}
