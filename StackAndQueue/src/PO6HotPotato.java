import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO6HotPotato {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue= Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new));

        int n=Integer.parseInt(scanner.nextLine());



        while (queue.size()!=1){


            for (int i = 1; i < n; i++) {
            String currentFirst=queue.poll();
            queue.offer(currentFirst);
            }
            System.out.println("Removed "+ queue.poll());
        }
        System.out.println("Last is "+ queue.peek());

    }
}
