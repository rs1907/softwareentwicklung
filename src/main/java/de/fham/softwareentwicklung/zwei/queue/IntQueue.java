package de.fham.softwareentwicklung.zwei.queue;

import java.util.ArrayList;

public class IntQueue implements Queue {


    private int first = 0;
    private int last = 0;
    private ArrayList list = new ArrayList();

    @Override
    public void add(int i) {
        list.add(last, i);
        last++;
    }

    @Override
    public int element() {
        checkQueueIsNotEmpty();
        return (int) list.get(first);
    }

    @Override
    public void remove() {
        checkQueueIsNotEmpty();
        first++;

    }

    private void checkQueueIsNotEmpty() {
        if (first >= last) {
            throw new EmptyQueueException();
        }
    }
}
