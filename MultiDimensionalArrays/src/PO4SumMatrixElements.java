import java.util.Arrays;
import java.util.Scanner;

public class PO4SumMatrixElements {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int[] first = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows=first[0];
        int column=first[1];

        int[][]matrix=new int[rows][column];
        System.out.println(rows);
        System.out.println(column);
        fillMatrix(matrix,scanner);


    }
    public static void fillMatrix(int[][]matrix,Scanner scanner){
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i]=Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int matrix1 : matrix[i]) {
                sum+=matrix1;
            }
        }
        System.out.println(sum);

    }

}
