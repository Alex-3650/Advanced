package PO1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PO1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<PO1OpinionPoll> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] split = scanner.nextLine().split("\\s+");

            String name = split[0];
            int age = Integer.parseInt(split[1]);
            PO1OpinionPoll person = new PO1OpinionPoll(name, age);
            list.add(person);


        }
        list.stream().filter(person -> person.getAge() > 30).sorted(Comparator.comparing(PO1OpinionPoll::getName)).
                forEach(System.out::println);
    }
    }
