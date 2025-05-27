import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PO7MergeTwoFiles {
    public static void main(String[] args) throws IOException {




        String path1="C:\\Users\\georg\\SoftUniAdvanced\\StramFilesAndDirectoriesExercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        BufferedReader reader= Files.newBufferedReader(Paths.get(path1));

        String path2="C:\\Users\\georg\\SoftUniAdvanced\\StramFilesAndDirectoriesExercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        BufferedReader reader2= Files.newBufferedReader(Paths.get(path2));

        BufferedWriter writer=new BufferedWriter(new FileWriter("merge_two_files.txt"));

        String line = reader.readLine();


        while (line!=null){


            writer.write(line+"\n");
            line = reader.readLine();
        }
        String line2 = reader2.readLine();
        while (line2!=null){


            writer.write(line2+"\n");
            line2 = reader2.readLine();
        }
        writer.flush();
    }
}
