import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO3Voina {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayer= Arrays.stream(scanner.nextLine().split("\\s+"))
                                            .map(Integer::parseInt).
                                            collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondPlayer= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).
                collect(Collectors.toCollection(LinkedHashSet::new));


        int rounds=50;

        while (rounds-- > 0){

            int firstStart= firstPlayer.iterator().next();

            int secondStart=secondPlayer.iterator().next();

            firstPlayer.remove(firstStart);
            secondPlayer.remove(secondStart);

            if (firstStart>secondStart){
                firstPlayer.add(firstStart);
                firstPlayer.add(secondStart);
            }else if (firstStart<secondStart){
                secondPlayer.add(firstStart);
                secondPlayer.add(secondStart);
            }

           if (firstPlayer.isEmpty()||secondPlayer.isEmpty()){
               break;
           }

        }
        String output;
        if (firstPlayer.size()>secondPlayer.size()){
       output="First player win!";
        }else if (firstPlayer.size()<secondPlayer.size()){
            output="Second player win!";
        }else{
          output="Draw!";
        }
        System.out.println(output);
    }
}
