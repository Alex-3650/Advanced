import java.util.ArrayDeque;
import java.util.Scanner;

public class PO4MatchingBrackets {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         //1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5


        String expression=scanner.nextLine();

        ArrayDeque<Integer>indexes=new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i)=='('){
                indexes.push(i);

            }else if(expression.charAt(i)==')'){
                  String text=expression.substring(indexes.peek(),i+1);
                  indexes.pop();
                System.out.println(text);
            }

        }
    }
}
