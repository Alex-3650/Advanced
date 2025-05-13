import java.awt.image.AreaAveragingScaleFilter;
import java.io.Console;
import java.lang.reflect.InaccessibleObjectException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO2SimpleCalculator {
    public static void main(String[] args) {
        //2 + 5 + 10 - 2 - 1
         Scanner scanner = new Scanner(System.in);

        ArrayDeque<String>calc = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new));



        while (calc.size()!=1){


            int lastNum=Integer.parseInt(calc.peek());
            calc.pop();
            if (calc.peek().equals("-")){
                calc.pop();
                int second= Integer.parseInt(calc.peek());
                calc.pop();
                calc.push(String.valueOf(lastNum-second));
            }else{
                calc.pop();
                int second= Integer.parseInt(calc.peek());
                calc.pop();
                calc.push(String.valueOf(lastNum+second));

            }

        }
        System.out.println(calc.peek());
    }
}
