package PO2;

import java.awt.event.HierarchyBoundsAdapter;
import java.util.*;
import java.util.stream.Collectors;

public class PO2Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<PO2CompanyRoster>employees=new ArrayList<>();

        for (int i = 0; i < n; i++) {


            String[] arr = scanner.nextLine().split("\\s+");
            String name=arr[0];
            double salary=Double.parseDouble(arr[1]);
            String position=arr[2];
            String department=arr[3];
            PO2CompanyRoster employee;
            switch (arr.length){

                case 4->{
                    employee=new PO2CompanyRoster(department,salary,position,name);

                }
                case 6-> {
                    employee=new PO2CompanyRoster(Integer.parseInt(arr[5]),department,arr[4],name,position,salary);
                    employees.add(employee);
                }

                case 5->{
                    if (!arr[4].matches("\\d+")){
                        employee=new PO2CompanyRoster(department,salary,position,name,arr[4]);
                        employees.add(employee);
                    }else{
                        employee=new PO2CompanyRoster(department,salary,position,name,Integer.parseInt(arr[4]));
                        employees.add(employee);
                    }
                }

            }

        }
        Map.Entry<String, List<PO2CompanyRoster>>  employee = employees
                .stream()
                .collect(Collectors.groupingBy(PO2CompanyRoster::getDepartment))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    double e1Salary = e1
                            .getValue()
                            .stream()
                            .mapToDouble(PO2CompanyRoster::getSalary)
                            .average()
                            .getAsDouble();
                    double e2Salary = e2
                            .getValue()
                            .stream()
                            .mapToDouble(PO2CompanyRoster::getSalary)
                            .average().getAsDouble();

                    return Double.compare(e2Salary, e1Salary);
                })
                .findFirst()
                .orElse(null);


        System.out.printf("Highest Average Salary: %s\n",employee.getKey());
        employee.getValue().stream().sorted((e1,e2)-> Double.compare(e2.getSalary(),e1.getSalary())).forEach(System.out::println);

    }
}
