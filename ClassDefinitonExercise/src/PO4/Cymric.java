package PO4;

public class Cymric extends Cat{

 private double furLength;
    public Cymric(String name, String type,double furLength) {
        this.furLength=furLength;
        super(name, type);
    }
    public String toString() {
        return String.format("%s %.2f",super.toString(),this.furLength);
    }
}
