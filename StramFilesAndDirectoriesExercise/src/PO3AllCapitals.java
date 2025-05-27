import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PO3AllCapitals {
    public static void main(String[] args) {
        String path="C:\\Users\\georg\\SoftUniAdvanced\\StramFilesAndDirectoriesExercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";




        try(BufferedReader reader= Files.newBufferedReader(Paths.get(path))) {
            BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"));

            String line= reader.readLine();
            while (line!=null){

                writer.write(line.toUpperCase()+"\n");
                line= reader.readLine();
            }
           writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
