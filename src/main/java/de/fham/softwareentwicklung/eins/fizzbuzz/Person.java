package de.fham.softwareentwicklung.eins.fizzbuzz;

public class Person {
    private String vorname;

    public void setVorname(String vorname) {
        if (!vorname.isEmpty()) {
            this.vorname = vorname;
        }
    }

    public String getVorname() {
        return vorname;
    }
}
