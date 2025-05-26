import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class PO4ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String path="C:\\Users\\georg\\SoftUniAdvanced\\StreamsFilesAndDirectories\\src\\Stream\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        Scanner scanner=new Scanner(new FileInputStream(path));

        PrintWriter writer=new PrintWriter(new FileOutputStream("extract-integers-txt"));

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                writer.println(scanner.next());
            }
            scanner.next();

        }
        writer.flush();
    }
}
