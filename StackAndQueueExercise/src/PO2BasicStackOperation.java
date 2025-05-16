import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class PO2BasicStackOperation {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer>stack=new ArrayDeque<>();
        int numbersToPush= scanner.nextInt();
        int numbersToPop=scanner.nextInt();
        int numToCheck=scanner.nextInt();

        for (int i = 0; i < numbersToPush; i++) {
            stack.push(scanner.nextInt());
            if (i>=numbersToPush-numbersToPop){
                stack.pop();
            }
        }

      if (stack.isEmpty()) System.out.println(0);
      else System.out.println(stack.contains(numToCheck)?"true": Collections.min(stack));


    }
}
