import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PO2SetsOfElements {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int[]arr= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
              int n=arr[0];
              int m=arr[1];


        Set<String>set1=new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(scanner.nextLine());


        }
        Set<String>set2=new LinkedHashSet<>();
        for (int i = 0; i < m; i++) {
            set2.add(scanner.nextLine());


        }
            set1.retainAll(set2);
        set1.forEach(x-> System.out.print(x+" "));


    }
}
