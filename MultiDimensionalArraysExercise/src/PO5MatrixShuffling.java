import java.util.Arrays;
import java.util.Scanner;

public class PO5MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int n2 = arr[1];
        String[][]matrix=new String[n][n2];
        fillMatrix(matrix,scanner);


        String command=scanner.nextLine();
        while (!"END".equals(command)){

            String [] commandArr=command.split("\\s+");
            int row1= Integer.parseInt(commandArr[1]);
            int col1= Integer.parseInt(commandArr[2]);
            int row2= Integer.parseInt(commandArr[3]);
            int col2= Integer.parseInt(commandArr[4]);



         if (check(command,matrix)){
             String first= matrix[row1][col1];
             String  second= matrix[row2][col2];
             matrix[row1][col1]= second;
             matrix[row2][col2]= first;
             print(matrix);
         }else{
             System.out.println("Invalid input!");
         }


            command=scanner.nextLine();
        }


    }
    public static void fillMatrix(String[][]matrix,Scanner scanner){


        for (int i = 0; i < matrix.length; i++) {
            matrix[i]=scanner.nextLine().split("\\s+");
        }
    }
    public static boolean check(String command, String[][] matrix){

        String [] commandArr=command.split("\\s+");
        int row1= Integer.parseInt(commandArr[1]);
        int col1= Integer.parseInt(commandArr[2]);
        int row2= Integer.parseInt(commandArr[3]);
        int col2= Integer.parseInt(commandArr[4]);

        if (!commandArr[0].equals("swap")){
            return false;
        }
        if (row1>=0&&row1<matrix.length&&row2>=0&&row2<matrix.length&&col1>=0&&col1<matrix[0].length&&col2>=0&&col2<matrix[0].length){
            return false   ;
        }
        if (command.length()!=5){
            return false;
        }
        return true;

    }
    public static void print(String[][]matrix){


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
