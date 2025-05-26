import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO6SortLines {
    public static void main(String[] args) throws IOException {
         Scanner scanner = new Scanner(System.in);


        Path path = Paths.get("C:\\Users\\georg\\SoftUniAdvanced\\StreamsFilesAndDirectories\\src\\Stream\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

              List<String> lines= Files.readAllLines(path).stream().sorted().toList();

        Path outputFiles = Paths.get("sort-lines.txt");

        Files.write(outputFiles,lines);

    }
}
