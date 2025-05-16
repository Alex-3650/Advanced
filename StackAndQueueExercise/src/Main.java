import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack=new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(stack::push);
        int n=Integer.parseInt(scanner.nextLine());

        int[] arr=new int[stack.size()];
        for (int i = arr.length-1; i>=0 ;i--) {
            arr[i]=stack.pop();
        }

        for (int i = 0; i < n/2; i++) {

            int sum=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=sum;

        }
        System.out.println(Arrays.toString(arr));


    }
    }
