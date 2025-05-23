import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PO4CountSymbols {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Map<Character,Integer>dictionary=new TreeMap<>();

        String text=scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {

            char current=text.charAt(i);

            if (!dictionary.containsKey(current)){
                dictionary.put(current,1);
            }else {
                dictionary.compute(current, (k, value) -> value + 1);


            }

        }
        dictionary.forEach((key, value) -> System.out.println(key + ": " + value + " time/s"));
    }
}
