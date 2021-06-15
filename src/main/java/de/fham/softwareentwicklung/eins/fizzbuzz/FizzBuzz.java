package de.fham.softwareentwicklung.eins.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        firstFizzBuzzer();

        secondFizzBuzzer();
    }

    private static void firstFizzBuzzer() {
        String output;

        for (int i = 1; i <= 100; i++){
            output = "";
            if (moduloWithoutRest(i, 3)) {
                output += "Fizz";
            }

            if (moduloWithoutRest(i, 5)) {
                output += "Buzz";
            }

            if (output.isEmpty()) {
                printLn(Integer.toString(i));
            } else {
                printLn(output);
            }
        }
    }

    private static void secondFizzBuzzer() {
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

    private static boolean moduloWithoutRest(int counter, int moduloNumber) {

        return counter % moduloNumber == 0;
    }
}
