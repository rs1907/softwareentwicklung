package de.fham.softwareentwicklung.zwei.queue;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class IntQueueTestShould {

    QueueInterface queue;

    @BeforeEach
    void setUp() {
        queue = new IntQueue();
    }

    @Test
    void returnElementsInFiFoOrder() {
        // Setup - Prepare the tast
        queue.add(1);
        queue.add(2);

        // Execute
        int element = queue.element();

        // Validate
        assertThat(element).isEqualTo(1);
    }

    @Test
    void removeElementsInFiFoOrder() throws EmptyQueueException {
        queue.add(1);
        queue.add(2);

        queue.remove();
        assertThat(queue.element()).isEqualTo(2);
    }

    @Test
    void throwsEmptyQueueExceptionWhenRemoveFromEmptyQueue() throws EmptyQueueException {

        queue.remove();

        System.out.println("We will get here!");

    }

    @Test
    void throwsEmptyQueueExceptionWhenGetElementFromEmptyQueue() {
        assertThatThrownBy(() -> queue.element()).isInstanceOf(EmptyQueueException.class);
    }
}
