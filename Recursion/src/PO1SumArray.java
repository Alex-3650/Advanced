import java.util.Arrays;
import java.util.Scanner;

public class PO1SumArray {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int[] arr= Arrays.stream(scanner.nextLine().split("\\s+"))
                 .mapToInt(Integer::parseInt)
                 .toArray();

        System.out.println(sum(arr,arr.length-1));

    }
    public static int sum(int[]arr,int i){

        if (i<0){
       return 0;
        }

        return  arr[i]+sum(arr,i-1);

    }
}
