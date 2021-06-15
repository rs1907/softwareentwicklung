package de.fham.softwareentwicklung.zwei.queue;

public interface QueueInterface {
    void add(int i);

    int element();

    void remove() throws EmptyQueueException;
}
