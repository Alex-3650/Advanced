import java.util.Arrays;
import java.util.Scanner;

public class PO2PositionsOf {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int[] first = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowsFirst = first[0];
        int colFirst = first[1];
        int[][] firstMatrix = new int[rowsFirst][colFirst];
        fillMatrix(firstMatrix,scanner);

        int num=Integer.parseInt(scanner.nextLine());
        isFound(firstMatrix,num);

    }
    private static void fillMatrix(int[][] firstMatrix,Scanner scanner) {

        for (int i = 0; i < firstMatrix.length; i++) {

            firstMatrix[i]=Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        }
    }
    public static void isFound(int[][] firstMatrix,int n){

       int c=0;
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[0].length; j++) {
                if (firstMatrix[i][j]==n){
                    System.out.println(i +" "+ j);
                }else c++;
            }
        }
        if (c==firstMatrix.length*firstMatrix[0].length){
            System.out.println("not found");
        }
    }

}
