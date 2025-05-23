import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PO5Phonebook {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Map<String,String>phone=new LinkedHashMap<>();


        String text=scanner.nextLine();

        while (!text.equals("search")){

             phone.put(text.split("-")[0],text.split("-")[1]);

             text=scanner.nextLine();
        }


        String name=scanner.nextLine();
        while (!name.equals("stop")){

            if (phone.containsKey(name)){

                System.out.println(name+" -> "+phone.get(name));
            }else {
                System.out.printf("Contact %s does not exist.\n",name);
            }



            name=scanner.nextLine();
        }
    }
}
