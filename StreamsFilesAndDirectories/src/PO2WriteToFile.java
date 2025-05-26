import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class PO2WriteToFile {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);


      String path="C:\\Users\\georg\\SoftUniAdvanced\\StreamsFilesAndDirectories\\src\\Stream\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

      Set<Character>symbols=Set.of(',', '.', '!', '?');



        try {
            FileInputStream inputStream=new FileInputStream(path);
            FileOutputStream outputStream=new FileOutputStream("write-to-file");
           int oneByte=inputStream.read();

           while (oneByte>=0){
               char symbol= (char) oneByte;

               if (!symbols.contains(symbol)){
                   outputStream.write(symbol);
               }
               oneByte=inputStream.read();
           }

        }catch (IOException e){
            System.out.println("File not found!");
        }


      }
    }
