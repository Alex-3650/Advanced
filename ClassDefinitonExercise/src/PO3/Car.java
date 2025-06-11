package PO3;

public class Car {
    //Model, fuel amount, fuel cost for 1 kilometer, and distance traveled

    private String model;
    private double fuelAmount;
    private double costFuel;
    private int travelDistance;

    //"{Model} {FuelAmount} {FuelCostFor1km}


    public Car(double costFuel, double fuelAmount, String model) {
        this.costFuel = costFuel;
        this.fuelAmount = fuelAmount;
        this.model = model;
        this.travelDistance = 0;
    }

    public boolean hasSufficientFuel(int km){
        double neededFuel = getNeededFuel(km);
        return this.fuelAmount>=neededFuel;
    }
    public void decreaseFuel(int km){
        double neededFuel = getNeededFuel(km);
        this.fuelAmount-=neededFuel;
    }
    public void increaseDistance(int km){
         travelDistance+=km;

    }

    private double getNeededFuel(int km) {
        return this.costFuel* km;
    }


    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model,this.fuelAmount,this.travelDistance);
    }
}
//AudiA4 1.00 50