package de.fham.softwareentwicklung.eins.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        int counter = 1;
        int stopAt = 100;

        while (counter <= stopAt) {
            if (moduloWithoutRest(counter, 3)) {
                printLn("Fizz");
            }

            if (moduloWithoutRest(counter, 5)) {
                printLn("Buzz");
            }

            if (!moduloWithoutRest(counter, 3) && !moduloWithoutRest(counter, 5)) {
                printLn(Integer.toString(counter));
            }
            counter++;
        }
    }

    private static void printLn(String toPrint) {
        System.out.println(toPrint);
    }

    private static boolean moduloWithoutRest(int counter, int i) {
        return counter % i == 0;
    }
}
