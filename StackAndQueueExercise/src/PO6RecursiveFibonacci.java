import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PO6RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());

        int first=0;
        int second=1;
        int third=first+second;
        if (n==0){
            System.out.println(0);
            return;
        }
        for (int i = 1; i <=n-2 ; i++) {

            first=second;
            second=third;
            third=first+second;

        }
        System.out.println(third);
    }
}
