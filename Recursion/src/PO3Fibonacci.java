import java.util.Locale;
import java.util.Scanner;

public class PO3Fibonacci {

    static  long [] fibonacciCache;
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);


        int n= scanner.nextInt();
        fibonacciCache=new long[n+1];

        System.out.println(fibonacci(n));
        for (long l : fibonacciCache) {
            System.out.print(l+" ");
        }
    }
    private static long fibonacci(int n){

        if (n<=1){
            return n;
        }

        if (fibonacciCache[n]!=0){
           return fibonacciCache[n];
        }

        long nthNumber=fibonacci(n-1)+fibonacci(n-2);
        fibonacciCache[n]=nthNumber;
        return nthNumber;

    }
}
