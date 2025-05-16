import java.util.ArrayDeque;
import java.util.Scanner;

public class PO5BalancedParentheses {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input=scanner.nextLine();
        ArrayDeque<Character>stack=new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
             char currentBracket=input.charAt(i);

             if (currentBracket=='('||currentBracket=='['||currentBracket=='{'){
                 stack.push(currentBracket);
                 continue;
             }else {
                 if (stack.isEmpty() || !isMatched(stack.pop(),currentBracket)){
                     System.out.println("NO");
                     return;
                 }
             }
        }

            System.out.println("YES");


    }

    private static boolean isMatched(char former,char current) {
        if (former=='['&&current==']'){
            return true;
        }else if (former=='('&&current==')'){
            return true;
        }else if (former=='{'&&current=='}'){
            return true;
        }else  return false;

    }
}
