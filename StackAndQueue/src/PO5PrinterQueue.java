import java.util.ArrayDeque;
import java.util.Scanner;

public class PO5PrinterQueue {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command=scanner.nextLine();
        ArrayDeque<String> queue=new ArrayDeque<>();
     int sum=0;
         while (!command.equals("print")){

             if (command.equals("cancel")){
                 if (queue.isEmpty()){
                     System.out.println("Printer is on standby");
                 }else{
                     System.out.println("Canceled "+ queue.poll());

                 }
             }else {
               queue.offer(command);

             }
             command=scanner.nextLine();
         }

        queue.forEach(System.out::println);


    }
}
