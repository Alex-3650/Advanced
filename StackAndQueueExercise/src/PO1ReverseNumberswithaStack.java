import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO1ReverseNumberswithaStack {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);



        ArrayDeque<String>stack= new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(stack::push);

        stack.forEach(x-> System.out.print(x+" "));

    }
}
