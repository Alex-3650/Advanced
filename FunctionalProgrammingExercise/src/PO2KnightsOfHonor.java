import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class PO2KnightsOfHonor {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e-> System.out.println("Sir "+e));

    }
}
