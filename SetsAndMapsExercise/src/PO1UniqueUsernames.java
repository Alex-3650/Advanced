import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PO1UniqueUsernames {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Set<String>set=new LinkedHashSet<>();


        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String text=scanner.nextLine();
            set.add(text);
        }
        for (String string : set) {
            System.out.println(string);
        }
    }
}
