import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PO6FindEvenOrOdds {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String[] arr =  scanner.nextLine().split("\\s+");

        int begin= Integer.parseInt(arr[0]);
        int end= Integer.parseInt(arr[1]);

        String condition=scanner.nextLine();

        if (condition.equals("odd")){
            printRange(begin,end,v->v%2!=0);
        }else{
            printRange(begin,end,v->v%2==0);
        }


    }

    private static void printRange(int begin, int end,  IntPredicate predicate) {



        IntStream.range(begin,end+1).filter(predicate).forEach( n -> System.out.print(n + " "));
    }
}
