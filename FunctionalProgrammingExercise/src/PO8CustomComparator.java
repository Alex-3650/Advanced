import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO8CustomComparator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);



        Comparator<Integer>custom= (first,second)->{

            if (first%2==0 && second%2!=0){
                return -1;
            }else if (first%2!=0 && second%2==0){
                return 1;
            }else{

                 return   first.compareTo(second);
            }
        };

        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).sorted(custom).forEach(System.out::print);




    }
}
