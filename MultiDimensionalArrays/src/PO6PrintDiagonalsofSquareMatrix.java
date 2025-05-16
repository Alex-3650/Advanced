import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.Scanner;

public class PO6PrintDiagonalsofSquareMatrix {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n= Integer.parseInt(scanner.nextLine());

         int[][]matrix=new int[n][n];
         fillMatrix(matrix,scanner);
         diagonals(matrix);


    }
    public static void fillMatrix(int[][]matrix,Scanner scanner){

        for (int i = 0; i < matrix.length; i++) {
            matrix[i]= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        }
    }
    public static void diagonals(int [][]matrix){

        int[]first=new  int[matrix.length];
        int[]second=new int[matrix.length];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {

                if (i==j){
                    first[i]=matrix[i][j];
                    second[i]=matrix[i][matrix.length-1-i];
                }
            }


        }
        for (int j : first) {
            System.out.print(j+" ");
        }
        System.out.println();
        for (int i = second.length-1; i >=0; i--) {{
            System.out.print(second[i]+" ");
        }

        }

    }
}
