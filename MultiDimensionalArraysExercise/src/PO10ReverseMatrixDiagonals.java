import java.util.Arrays;
import java.util.Scanner;

public class PO10ReverseMatrixDiagonals {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int n2 = arr[1];

        int [][]matrix=new int[n][n2];


    }
    public static void fillMatrix(int[][]matrix,Scanner scanner){


        for (int i = 0; i < matrix.length; i++) {

           matrix[i]= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
    }
}
