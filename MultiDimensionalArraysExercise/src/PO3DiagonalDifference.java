import java.util.Arrays;
import java.util.Scanner;

public class PO3DiagonalDifference {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


         int n=Integer.parseInt(scanner.nextLine());
         int[][]matrix=new int[n][n];
        fillMatrixAndPrintTheDiagonals(matrix,scanner);

    }

    private static void fillMatrixAndPrintTheDiagonals(int[][] matrix, Scanner scanner) {
      int primaryDiagonal=0;
        int secondaryDiagonal=0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
               matrix[i][j] = scanner.nextInt();
               if (i==j){
                   primaryDiagonal+=matrix[i][j];
               }
               if (j==matrix[0].length-1-i){
                  secondaryDiagonal+= matrix[i][j];

               }



            }
        }
        System.out.println(Math.abs(primaryDiagonal-secondaryDiagonal));
    }
}
