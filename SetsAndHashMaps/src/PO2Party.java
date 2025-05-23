import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PO2Party {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Set<String>regular=new TreeSet<>();
        Set<String>vip=new TreeSet<>();


        String command=scanner.nextLine();

        while (!"PARTY".equals(command)){
               char startsWith=command.charAt(0);
               if (Character.isDigit(startsWith)){

                   vip.add(command);
               }else{
                   regular.add(command);
               }
          command=scanner.nextLine();
        }

        command=scanner.nextLine();
        while (!"END".equals(command)){
            regular.remove(command);
            vip.remove(command);
            command=scanner.nextLine();
        }

        System.out.println(vip.size()+regular.size());
       vip.forEach(System.out::println);
        regular.forEach(System.out::println);





    }
}
