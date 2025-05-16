import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class PO3MaximumElement {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n=Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer>stack=new ArrayDeque<>();
        for (int i = 0; i < n; i++) {

            String currentCommand= scanner.nextLine();

            if (currentCommand.equals("2")){
                stack.pop();
            }else if (currentCommand.equals("3")){
                if (!stack.isEmpty()){
                    System.out.println(Collections.max(stack));
                }

            }else{
                int num=Integer.parseInt(currentCommand.split("\\s")[1]);
                stack.push(num);

            }

        }
    }
}
