import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PO3CountUpperCase {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String text=scanner.nextLine();
        String[] split = text.split("\\s+");

        Predicate<String> isUpperCase= s -> Character.isUpperCase(s.charAt(0));
        Function<String[], List<String>> output=arr -> Arrays.stream(arr).filter(isUpperCase).toList();

       List<String>upperCase=output.apply(split);
        System.out.println(upperCase.size());

        Consumer<String>outputConsumer= System.out::println;
        upperCase.forEach(outputConsumer);


    }
}
