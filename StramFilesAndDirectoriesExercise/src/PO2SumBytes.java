import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PO2SumBytes {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\georg\\SoftUniAdvanced\\StramFilesAndDirectoriesExercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        //BufferedReader reader=new BufferedReader(new FileReader(path));
      long sum=0;
        try ( BufferedReader reader= Files.newBufferedReader(Paths.get(path))){

            String line=reader.readLine();

            while (line!=null){

                for (char c : line.toCharArray()) {
                     sum+=c;
                }


                line=reader.readLine();
            }


        }

        System.out.println(sum);

    }
}
