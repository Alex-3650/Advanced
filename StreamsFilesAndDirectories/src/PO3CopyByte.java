import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PO3CopyByte {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\georg\\SoftUniAdvanced\\StreamsFilesAndDirectories\\src\\Stream\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

            FileInputStream inputStream=new FileInputStream(path);
        FileOutputStream outputStream=new FileOutputStream("CopyByte");


            int oneByte=inputStream.read();

            while (oneByte!=-1){

                  if (oneByte==32 ){
                      outputStream.write(' ');

                  }else if (oneByte==10){
                      outputStream.write('\n');
                  }
                   else {
                      String message=String.valueOf(oneByte);

                      for (char c : message.toCharArray()) {
                          outputStream.write(c);

                      }
                  }
                  

                oneByte=inputStream.read();
            }


    }
}
