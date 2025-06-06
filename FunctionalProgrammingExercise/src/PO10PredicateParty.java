import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PO10PredicateParty {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<String> list = (Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList()));

        String line=scanner.nextLine();
        Predicate<String>predicate;



         while (!line.equals("Party!")){

             String criteria=line.split("\\s+")[2];


                 if (line.contains("StartsWith")){
                     predicate=e->e.startsWith(criteria);


                 }else if (line.contains("EndsWith")){
                    predicate=e->e.endsWith(criteria);

                 }else {

                     predicate=e->e.length()==Integer.parseInt(criteria);
                 }
                 if (line.contains("Remove")){
                    list.removeIf(predicate);

                 }else{
                     List<String> guestsDoubled = list.stream().filter(predicate).toList();
                     list.addAll(guestsDoubled);
                 }

             line=scanner.nextLine();
         }

         if (list.isEmpty()){
             System.out.println("Nobody is going to the party!");
         }else{

              String result = list.stream().sorted().collect(Collectors.joining(", ") )+ "are going to the party!";
             System.out.println(result);
         }
    }
}
