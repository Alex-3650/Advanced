import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO3IntersectionofTwoMatrices {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


        int rowsFirst = Integer.parseInt(scanner.nextLine());
        int colFirst = Integer.parseInt(scanner.nextLine());
        String [][]matrixFirst=new String[rowsFirst][colFirst];
        String [][]matrixSecond=new String[rowsFirst][colFirst];

        fillMatrix(matrixFirst,scanner);
        fillMatrix(matrixSecond,scanner);

        modifiedMatrix(matrixSecond,matrixFirst);

    }

    private static void modifiedMatrix(String[][] matrixSecond, String[][] matrixFirst) {

        for (int i = 0; i < matrixFirst.length ; i++) {
            for (int j = 0; j < matrixFirst[0].length; j++) {
                String first=matrixFirst[i][j];
                String second=matrixSecond[i][j];
                if (!first.equals(second)){
                    System.out.print("* ");
                }else{
                    System.out.print(matrixFirst[i][j]+" ");
                }

            }
            System.out.println();
        }

    }
    public static void fillMatrix(String[][]matrix,Scanner scanner){

        for (int i = 0; i < matrix.length; i++) {
            matrix[i]=scanner.nextLine().split("\\s+");
        }

    }
}
