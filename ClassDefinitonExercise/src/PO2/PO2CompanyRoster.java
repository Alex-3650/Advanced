package PO2;

public class PO2CompanyRoster {

    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    public PO2CompanyRoster(String department, double salary, String position, String name) {
        this( -1,  department, "n/a",  name, position,  salary);
    }
    public PO2CompanyRoster(String department, double salary, String position, String name,String email) {
        this( -1,  department, email,  name, position,  salary);
    }
    public PO2CompanyRoster(String department, double salary, String position, String name,int age) {
        this( age,  department, "n/a",  name, position,  salary);
    }

    public PO2CompanyRoster(int age, String department, String email, String name, String position, double salary) {
        this.age = age;
        this.department = department;
        this.email = email;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d",getName(),getSalary(),getEmail(),getAge());
    }

}
