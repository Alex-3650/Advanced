import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.fill;

public class PO4MaximalSum {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int[] dimensions= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
         int n=dimensions[0];
        int n2=dimensions[1];
        int[][]matrix=new int[n][n2];
        fillMatrix(matrix,scanner);
        findSubMatrix(matrix);


    }

    private static void findSubMatrix(int[][] matrix) {
       int sum=Integer.MIN_VALUE;
       int index1=0;
       int index2=0;
       int current=0;
        for (int i = 0; i < matrix.length-2; i++) {

            for (int j = 0; j < matrix[0].length-2; j++) {

                current=matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j]+matrix[i+1][j+1]+matrix[i+1][j+2]+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
                if (sum<current){
                    sum=current;
                    index1=i;
                    index2=j;
                }

            }

        }
        /////////////////////////////////////////////////////////
        System.out.println("Sum = "+sum);
        System.out.println(matrix[index1][index2]+" "+matrix[index1][index2+1]+" "+matrix[index1][index2+2]);
        System.out.println(matrix[index1+1][index2]+" "+matrix[index1+1][index2+1]+" "+matrix[index1+1][index2+2]);
        System.out.println(matrix[index1+2][index2]+" "+matrix[index1+2][index2+1]+" "+matrix[index1+2][index2+2]);

    }

    public static void fillMatrix(int[][]matrix,Scanner scanner){

        for (int i = 0; i < matrix.length; i++) {
            matrix[i]=Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        }


    }
}
