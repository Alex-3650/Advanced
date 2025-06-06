import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PO5ReverseandExclude {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

         int n=Integer.parseInt(scanner.nextLine());
        Predicate<Integer> isDivisible=e->e%n==0;

        list.removeIf(isDivisible);

        Collections.reverse(list);

        Consumer<List<Integer>> print= l-> list.forEach(e-> System.out.print(e+" "));
        print.accept(list);
    }
}
