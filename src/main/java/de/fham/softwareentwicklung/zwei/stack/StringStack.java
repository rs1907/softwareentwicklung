package de.fham.softwareentwicklung.zwei.stack;

import java.util.ArrayList;

public class StringStack implements StackInterface{

    ArrayList<String> stackStorage;

    public StringStack() {
        stackStorage = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return stackStorage.isEmpty();
    }

    @Override
    public void push(String i) {
        stackStorage.add(stackStorage.size(), i);
    }

    @Override
    public String pop() {
        return stackStorage.remove(stackStorage.size() - 1);
    }
}
