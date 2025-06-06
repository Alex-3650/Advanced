import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PO6PredicateForNames {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n=Integer.parseInt(scanner.nextLine());

        String[] array = scanner.nextLine().split("\\s+");

        Predicate<String> isProperLength=e-> e.length()<=n;


        Arrays.stream(array).filter(isProperLength).forEach(System.out::println);
    }
}
