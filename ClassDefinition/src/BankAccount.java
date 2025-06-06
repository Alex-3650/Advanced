public class BankAccount {

     private static double interestRates=0.02;
    private int id;
    private static int idCounter=1;
    private double balance;

    public int getId() {
        return id;
    }

    public static void setInterestRates(double interestRates) {
        BankAccount.interestRates = interestRates;
    }

    public double getInterest(int years) {
        return interestRates*years*balance;
    }
    public void deposit(double amount){
      balance+=amount;
    }

    public BankAccount(){
         this.id=  idCounter;
        idCounter++;

    }

}