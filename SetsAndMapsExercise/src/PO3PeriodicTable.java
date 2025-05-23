import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PO3PeriodicTable {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


         int n=Integer.parseInt(scanner.nextLine());
         Set<String> elements=new TreeSet<>();


        for (int i = 0; i < n; i++) {


            elements.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));

        }
        String text=String.join(" ",elements);
        System.out.println(text);
    }
}
