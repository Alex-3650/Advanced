import java.util.Arrays;
import java.util.Scanner;

public class PO1CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] first = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowsFirst = first[0];
        int colFirst = first[1];
        int[][] firstMatrix = new int[rowsFirst][colFirst];

        fillMatrix(firstMatrix,scanner);
        //second

        int[] second = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowsSecond = second[0];
        int colSecond = second[1];
        int[][] secondMatrix = new int[rowsSecond][colSecond];

        fillMatrix(secondMatrix,scanner);



        if (isEqual(firstMatrix,secondMatrix)){
            System.out.println("equal");
        }else System.out.println("not equal");

    }

    private static void fillMatrix(int[][] firstMatrix,Scanner scanner) {

        for (int i = 0; i < firstMatrix.length; i++) {

            firstMatrix[i]=Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            
        }
    }
    private static boolean isEqual(int[][]first,int[][]second ){
        if (first.length!=second.length ||first[0].length!=second[0].length){
            return false;
        }

        for (int i = 0; i <first.length ; i++) {

            for (int j = 0; j < first[0].length; j++) {
                if (first[i][j]!=second[i][j]){
                    return false;
                }

            }

        }
        return true;

}
}
