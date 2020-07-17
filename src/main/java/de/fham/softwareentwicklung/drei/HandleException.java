package de.fham.softwareentwicklung.drei;

import java.util.ArrayList;
import java.util.List;

public class HandleException {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Hallo");
        myList.add("Hallo");
        myList.add("Hallo");
        myList.add("Hallo");
        myList.add("Hallo");
        myList.add("Hallo");

        int i = 0;
        try {

            while (true) {
                System.out.println(myList.get(i));
                i++;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println(i);
        }


    }
}
