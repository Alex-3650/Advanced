import com.sun.security.jgss.GSSUtil;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class PO1BrowserHistory {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String command= scanner.nextLine();
        ArrayDeque<String>stack=new ArrayDeque<>();

        while (!command.equals("Home")){

            if (command.equals("back")){

                if (stack.size()<=1){
                    System.out.println("no previous URLs");
                }else{
                    stack.pop();
                    System.out.println(stack.peek());
                }
            }else{

                System.out.println(command);
                stack.push(command);

            }
            command= scanner.nextLine();
        }
    }
}
