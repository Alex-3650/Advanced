import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           String line=scanner.nextLine();
        Map<Integer,BankAccount>banUsers=new HashMap<>();

           while (!line.equals("End")){

           String[]tokens=line.split("\\s+");
           String command=tokens[0];

           if (command.equals("Create")){
               create(banUsers);
           }else if (command.equals("Deposit")){
               deposit(tokens, banUsers);

           }else if (command.equals("SetInterest")){
               setInterest(tokens);
           }else{

               getInterest(tokens, banUsers);

           }




               line=scanner.nextLine();
           }
    }

    private static void getInterest(String[] tokens, Map<Integer, BankAccount> banUsers) {
        int id=Integer.parseInt(tokens[1]);
        int years=Integer.parseInt(tokens[2]);
        BankAccount bankAccount= banUsers.get(id);
        if (bankAccount!=null){
            System.out.printf("%.2f\n",bankAccount.getInterest(years));

        }else{
            System.out.println("Account does not exist");
        }
    }

    private static void setInterest(String[] tokens) {
        double interest=Double.parseDouble(tokens[1]);
        BankAccount.setInterestRates(interest);
    }

    private static void create(Map<Integer, BankAccount> banUsers) {
        BankAccount account=new BankAccount();
        banUsers.put(account.getId(), account);
        System.out.println("Account ID"+account.getId()+" created");
    }

    private static void deposit(String[] tokens, Map<Integer, BankAccount> banUsers) {
        int id=Integer.parseInt(tokens[1]);
        int amount=Integer.parseInt(tokens[2]);
        BankAccount bankAccount = banUsers.get(id);
        if (bankAccount!=null){
            bankAccount.deposit(amount);
            System.out.printf("Deposited %d to ID%d\n",amount,bankAccount.getId());
        }else{
            System.out.println("Account does not exist");
        }
    }
}