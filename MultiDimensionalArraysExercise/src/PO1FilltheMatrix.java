import java.util.Arrays;
import java.util.Scanner;

public class PO1FilltheMatrix {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

       String[]arr= scanner.nextLine().split(", ");
       int num=Integer.parseInt(arr[0]);
       String c=arr[1];
       fillMatrix(num,c);


    }
    public static void fillMatrix(int n,String c) {

        int counter = 1;
        int[][] matrix = new int[n][n];
        if (c.equals("A")) {
            for (int i = 0; i < matrix.length; i++) {

                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[j][i] = counter;


                    counter++;

                }


            }
        } else if (c.equals("B")) {
            for (int i = 0; i < matrix.length; i++) {


                if (i % 2 == 0) {
                    for (int j = 0; j < matrix[0].length; j++) {
                        matrix[j][i] = counter;

                        counter++;

                    }

                } else {
                    for (int j = matrix[0].length - 1; j >= 0; j--) {
                        matrix[j][i] = counter;


                        counter++;
                    }




                }


            }


        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }
    }
}
