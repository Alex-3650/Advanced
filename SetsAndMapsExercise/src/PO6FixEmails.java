import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PO6FixEmails {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Map<String,String>map=new LinkedHashMap<>();

        String name=scanner.nextLine();


        while (!name.equals("stop")){
            String email=scanner.nextLine();
            int index=email.lastIndexOf('.');

         String sub=email.substring(index+1);

         if (!sub.equals("us")&&!sub.equals("uk")&&!sub.equals("com")){


             map.put(name,email);
         }
            name=scanner.nextLine();


        }
        map.forEach((k,v)-> System.out.println(k+" -> "+v));
    }
}
