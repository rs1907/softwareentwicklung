package de.fham.softwareentwicklung.zwei.stack;

import java.util.ArrayList;
import java.util.List;

public class StringStack implements StackInterface {

    private List<String> elements = new ArrayList();

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void push(String element) {
        elements.add(elements.size(), element);
    }

    @Override
    public String pop() {
        return elements.remove(elements.size() - 1);
        // new comment
    }
}
