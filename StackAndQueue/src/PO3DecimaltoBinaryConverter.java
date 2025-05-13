import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PO3DecimaltoBinaryConverter {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt( scanner.nextLine());
        ArrayDeque<Integer>decimalNum=new ArrayDeque<>();






                while (n != 0) {

                    decimalNum.push(n % 2);

                    n /= 2;
                }

                if (decimalNum.isEmpty()){
                    System.out.println(0);
                }else{
                    decimalNum.forEach(System.out::print);
                }



    }
}
