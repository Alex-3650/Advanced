package PO4;

public class StreetExtraordinaire extends Cat{

    private  double decibels;
    public StreetExtraordinaire(String name, String type,double decibels) {
        this.decibels=decibels;
        super(name, type);
    }
    public String toString() {
        return String.format("%s %.2f",super.toString(),this.decibels);
    }
}
