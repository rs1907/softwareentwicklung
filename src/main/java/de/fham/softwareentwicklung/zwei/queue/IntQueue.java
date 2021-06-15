package de.fham.softwareentwicklung.zwei.queue;

import java.util.ArrayList;

public class IntQueue implements QueueInterface {

    private ArrayList<Integer> queue;

    public IntQueue() {
        queue = new ArrayList<>();
    }

    @Override
    public void add(int i) {
        queue.add(i);
    }

    @Override
    public int element() {
        return queue.get(0);
    }

    @Override
    public void remove() throws EmptyQueueException {
        int wichtigerWert;
        try {
            wichtigerWert = queue.remove(0);
        } catch (IndexOutOfBoundsException e) {
            throw new EmptyQueueException();
        }
    }

    public void remove2() {

        if (queue.size() != 0) {
            queue.remove(0);
        }
    }
}
