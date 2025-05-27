import java.util.Scanner;

public class PO2CalculateFactorial {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int n=Integer.parseInt(scanner.nextLine());

        System.out.println(recursiveFactorial(n));
    }

    private static int recursiveFactorial(int n) {

        if (n==1){
            return 1;
        }

        return  n * recursiveFactorial(n - 1);
    }
}
