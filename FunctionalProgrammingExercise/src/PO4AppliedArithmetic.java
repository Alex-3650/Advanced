import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PO4AppliedArithmetic {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Function <List<Integer>,List<Integer>>add=l-> l.stream().map(e->e+1).collect(Collectors.toList());

       Function<List<Integer>,List<Integer>> multiply= l-> l.stream().map(e->e*2).toList();

        Function<List<Integer>,List<Integer>> subtract= l-> l.stream().map(e->e-1).toList();


        Consumer<List<Integer>>print=list-> list.forEach(e-> System.out.print(e+" "));

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toList();

        String line=scanner.nextLine();

     while (!line.equals("end")){


         if (line.equals("add")){

             list=add.apply(list);
         }else if (line.equals("multiply")){
             list=multiply.apply(list);
         }else if (line.equals("subtract")){

             list=subtract.apply(list);
         }else{

            print.accept(list);
             System.out.println();
         }



         line=scanner.nextLine();
     }








    }



    }

