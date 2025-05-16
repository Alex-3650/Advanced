import java.util.Arrays;
import java.util.Scanner;

public class PO5MaximumSumof2X2Submatrix {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int[] first = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows=first[0];
        int column=first[1];

        int[][]matrix=new  int[rows][column];
        fillMatrix(matrix,scanner);


        findTheBiggestMatrix(matrix);
    }

    private static void findTheBiggestMatrix(int[][] matrix) {



        int[][] biggest2=new int[2][2];
        int sum=Integer.MIN_VALUE;
        int current=0;
        int startRow=0;
        int startCol=0;


        for (int i = 0; i <matrix.length-1 ; i++) {

            for (int j = 0; j < matrix[0].length-1; j++) {

                current=matrix[i][j]+ matrix[i][j + 1]+ matrix[i + 1][j]+ matrix[i + 1][j + 1];
                if (sum<current){
                    sum=current;
                    startRow=i;
                    startCol=j;
                }
            }

        }
        System.out.println(matrix[startRow][startCol] + " "+ matrix[startRow][startCol+1]+" ");
        System.out.println(matrix[startRow+1][startCol] + " "+ matrix[startRow+1][startCol+1]+" ");
        System.out.println(sum);



    }

    public static void fillMatrix(int[][]matrix,Scanner scanner){
        for (int i = 0; i < matrix.length; i++) {
            matrix[i]=Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        }


    }
}
