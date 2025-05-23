import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PO1ParkingLot {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input=scanner.nextLine();
        Set<String>parkingLot=new LinkedHashSet<>();
         while (!"END".equals(input)){
            String command=input.split(", ")[0];
             String number=input.split(", ")[1];

             if (command.equals("IN")){
               parkingLot.add(number);
             }else{

               parkingLot.remove(number);
             }
             input=scanner.nextLine();
         }
         if (parkingLot.isEmpty()){
             System.out.println("Parking Lot is Empty");
         }else{
             for (String string : parkingLot) {
                 System.out.println(string);
             }
         }
    }
}
