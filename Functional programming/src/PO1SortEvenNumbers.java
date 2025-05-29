import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PO1SortEvenNumbers {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


      List<Integer> list=Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).filter(e->e%2==0).boxed().toList();

        Function<List<Integer>,String> format=l -> l.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(format.apply(list));

        List<Integer> list2 = list.stream().sorted().toList();

        System.out.println(format.apply(list2));


    }

}
