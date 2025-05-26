import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class PO1ReadFile {
    public static void main(String[] args)  {

        String path="C:\\Users\\georg\\SoftUniAdvanced\\StreamsFilesAndDirectories\\src\\Stream\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        //String property = System.getProperty("user.dir");
        try(FileInputStream inputStream=new FileInputStream(path)) {
            int oneByte=inputStream.read();
            while (oneByte>=0){
                System.out.print(Integer.toBinaryString(oneByte)+" ");

           oneByte=inputStream.read();


            }

        }catch (IOException e){
            System.out.println("A problem occurred");
        }
    }
}
