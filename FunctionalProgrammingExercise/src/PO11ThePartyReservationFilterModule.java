import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PO11ThePartyReservationFilterModule {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String line=scanner.nextLine();
          Predicate<String>predicate;

        Map<String ,Predicate<String>>map=new HashMap<>();
         while (!line.equals("print")){

             String[] split = line.split(";");

          String command= split[0];

          String secondAndThird=split[1]+split[2];
          if (command.equals("Add filter")){

              switch (split[1]){

                  case "Starts with"->{
                      predicate=e->e.startsWith(split[2]);
                      map.putIfAbsent(secondAndThird,predicate);

                  }
                  case "Ends wit"->{
                      predicate=e->e.endsWith(split[2]);
                      map.putIfAbsent(secondAndThird,predicate);

                  }
                  case "Length"->{

                      predicate=e->e.length()==Integer.parseInt(split[2]);
                      map.putIfAbsent(secondAndThird,predicate);
                  }
                  case"Contains"->{
                      predicate=e->e.contains(split[2]);
                      map.putIfAbsent(secondAndThird,predicate);

                  }
              }

          }else{
              map.remove(secondAndThird);
          }


             line= scanner.nextLine();
         }




    }
}
