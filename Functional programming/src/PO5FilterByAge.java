import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PO5FilterByAge  {

    public static class Person{

        private String name;
        private int age;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n=Integer.parseInt(scanner.nextLine());
        List<Person> people=new ArrayList<>();

        while (n-- >0) {
            String[] tokens=scanner.nextLine().split(", ");
            int age= Integer.parseInt(tokens[1]);
            String name=tokens[0];

            Person p=new Person(age,name);
            people.add(p);

        }
        String condition=scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());
        String format=scanner.nextLine();

        Predicate<Person>filter=createFilter(condition,age);
        Consumer<Person>printer=createFormater(format);

        people.stream().
                filter(filter)
                .forEach(printer);

    }

    private static Consumer<Person> createFormater(String format) {
        if (format.equals("name")){
            return p -> System.out.println(p.getName());
        }else if (format.equals("age")){
            return p -> System.out.println(p.getAge());
        }else{

            return p -> System.out.println(p.getName()+" - "+ p.getAge());
        }
    }

    public static Predicate<Person>createFilter(String cond,int age){

        if (cond.equals("younger")){

            return person -> person.getAge() <= age;
        }

        return person -> person.getAge() >= age;

    }
}
