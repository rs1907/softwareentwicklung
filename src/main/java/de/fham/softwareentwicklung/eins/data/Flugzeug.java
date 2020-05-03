package de.fham.softwareentwicklung.eins.data;

public class Flugzeug {

//    Attribute des Flugzeugs
    public String model;
    final int plaetze = 123;
    Ort ort;
    float geflogeneKm;

//    Konstruktor der Klasse Flugzeug
//    Erzeugen eines Objekts vom Typ Flugzeug über Schlüsselwort new
    public Flugzeug(String model) {
        this.model = model;
    }

//    Weiterer Konstruktor
//    Überladen des vorherigen Konstruktors mit anderen Parameter
    public Flugzeug(Ort ort) {
        this.ort = ort;
    }

    public Flugzeug(String model_of_the_airplane, Ort ort) {
        this.model = "default";
    }

//    Methoden des Flugzeugs
    public void departure(Ort ort) {
        this.ort = ort;
    }

    public void departure()  {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
