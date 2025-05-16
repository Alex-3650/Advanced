import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class PO4BasicQueueOperation {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue=new ArrayDeque<>();
        int numbersToPush= scanner.nextInt();
        int numbersToPop=scanner.nextInt();
        int numToCheck=scanner.nextInt();

        for (int i = 0; i < numbersToPush; i++) {
            queue.offer(scanner.nextInt());
            if (i>=numbersToPush-numbersToPop){
                queue.poll();
            }
        }

        if (queue.isEmpty()) System.out.println(0);
        else System.out.println(queue.contains(numToCheck)?"true": Collections.min(queue));
    }
}
