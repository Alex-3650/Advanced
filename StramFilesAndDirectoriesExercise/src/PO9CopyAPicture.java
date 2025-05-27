import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class PO9CopyAPicture {
    public static void main(String[] args)  {

        String path="C:\\Users\\georg\\SoftUniAdvanced\\StramFilesAndDirectoriesExercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\IMG_5393.jpeg";



        try ( FileInputStream inputStream=new FileInputStream(path);FileOutputStream outputStream=new FileOutputStream("picture.jpg")){

           int oneByte= inputStream.read();
           while (oneByte!=-1){
               outputStream.write(oneByte);
               oneByte= inputStream.read();
           }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
