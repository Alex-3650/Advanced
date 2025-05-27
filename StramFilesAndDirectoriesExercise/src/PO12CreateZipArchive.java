import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class PO12CreateZipArchive {
    public static void main(String[] args)  {

        String path1="C:\\Users\\georg\\SoftUniAdvanced\\StramFilesAndDirectoriesExercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String path2="C:\\Users\\georg\\SoftUniAdvanced\\StramFilesAndDirectoriesExercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String path3="C:\\Users\\georg\\SoftUniAdvanced\\StramFilesAndDirectoriesExercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String outputPath="C:\\Users\\georg\\SoftUniAdvanced\\StramFilesAndDirectoriesExercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.zip";


        List<String>paths=List.of(path1,path2,path3);
        try (FileOutputStream outputStream=new FileOutputStream(outputPath);
             ZipOutputStream zipOutputStream=new ZipOutputStream(outputStream)){

            for (String path : paths) {
                File zipFile=new File(path);

                ZipEntry zipEntry = new ZipEntry(zipFile.getName());
                zipOutputStream.putNextEntry(zipEntry);

                FileInputStream inputStream=new FileInputStream(zipFile);
                int read = inputStream.read();
                while (read!=-1){

                   zipOutputStream.write(read);

                    read = inputStream.read();
                }
                inputStream.close();


            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
