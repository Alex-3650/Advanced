import java.io.*;
import java.nio.BufferOverflowException;

public class PO1SumLines {
    public static void main(String[] args) throws FileNotFoundException {


         String path="C:\\Users\\georg\\SoftUniAdvanced\\StramFilesAndDirectoriesExercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";



        try (BufferedReader reader=new BufferedReader(new FileReader(path))){
          String current=reader.readLine();
          int sum=0;
          while (current!=null){

              for (char c : current.toCharArray()) {
                  sum+=c;
              }
              System.out.println(sum);
              sum=0;
              current=reader.readLine();
          }

        } catch (IOException e) {
             e.getMessage();
        }


    }

}
