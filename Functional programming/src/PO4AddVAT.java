import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class PO4AddVAT {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Prices with VAT:");
        Function<String,Double>parsePrice=s -> Double.parseDouble(s) * 1.2;

        Arrays.stream(scanner.nextLine().split(", ")).map(parsePrice).forEach( v -> System.out.printf("%.2f\n",v));
    }
}
