package PO4;

public class Siamese extends  Cat{

 private double earSize;
    public Siamese(String name, String type,double earSize) {
        this.earSize=earSize;
        super(name, type);
    }

    @Override
    public String toString() {
        return String.format("%s %.2f",super.toString(),this.earSize);
    }
}
