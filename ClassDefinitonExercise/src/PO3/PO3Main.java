package PO3;

import java.util.*;

public class PO3Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n=Integer.parseInt(scanner.nextLine());

        Map<String,Car>cars=new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] arr = scanner.nextLine().split("\\s+");
            String model=arr[0];
            int fuelAmount= Integer.parseInt(arr[1]);
            double fuelCost= Double.parseDouble(arr[2]);
            Car car=new Car(fuelCost,fuelAmount,model);
            cars.put(model,car);
        }
        String line=scanner.nextLine();

        while (!line.equals("End")){

            String[] arr =line.split("\\s+");
            String model=arr[1];
            int km= Integer.parseInt(arr[2]);

            Car car=cars.get(model);

            if (car.hasSufficientFuel(km)){
                car.decreaseFuel(km);

                car.increaseDistance(km);
            }else{
                System.out.println("Insufficient fuel for the drive");
            }

            line=scanner.nextLine();
        }
        cars.values().forEach(System.out::println);
//"Drive {CarModel} {amountOfKm}"

    }
}
