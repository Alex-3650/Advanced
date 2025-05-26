import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class PO7ListFiles {
    public static void main(String[] args) {


        File file=new File("C:\\Users\\georg\\SoftUniAdvanced\\StreamsFilesAndDirectories\\src\\Stream\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        for (File listFile : Objects.requireNonNull(file.listFiles())) {
            if (listFile.isFile()){
                System.out.println(listFile.getName()+": ["+listFile.length()+"]");

            }

        }
    }
}
