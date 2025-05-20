import java.util.Arrays;
import java.util.Scanner;

public class PO2MatrixOfPalindromes {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int[] arr= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
         int n= arr[0];
         int n2=arr[1];
  palindromeMatrix(n,n2);




    }
    public static void palindromeMatrix (int n,int n2){

        String [][] matrix=new String[n][n2];


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n2; j++) {

                String toFill= String.valueOf((char) (97 + i)) + (char) (97 + i + j) + (char) (97 + i);
                matrix[i][j]=toFill;
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }


    }
}
