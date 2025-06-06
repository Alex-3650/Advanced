import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;

public class PO3CustomMinFunction {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Function<Integer[],Integer>minValue= arr->{

            return Arrays.stream(arr).min(Integer::compare).get();

        };
        Integer[] arr= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        System.out.println( minValue.apply(arr));




    }
}
