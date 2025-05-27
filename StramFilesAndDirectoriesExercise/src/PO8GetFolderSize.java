import java.io.File;

public class PO8GetFolderSize {
    public static void main(String[] args) {

        File file=new File("C:\\Users\\georg\\SoftUniAdvanced\\StramFilesAndDirectoriesExercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources");
        System.out.println(file.length());
    }
}
