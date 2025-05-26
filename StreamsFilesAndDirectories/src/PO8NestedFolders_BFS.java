import java.io.File;
import java.util.ArrayDeque;

public class PO8NestedFolders_BFS {
    public static void main(String[] args) {

        File file=new File("C:\\Users\\georg\\SoftUniAdvanced\\StreamsFilesAndDirectories\\src\\Stream\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        int folderCount=0;
        ArrayDeque<File>queue=new ArrayDeque<>();

        queue.add(file);

        while (!queue.isEmpty()){
       File current=queue.poll();
            System.out.println(current.getName());
            folderCount++;
            File[] files = current.listFiles();

            if (files!=null){

                for (File f : files) {
                    if (f.isDirectory()){
                        queue.offer(f);
                    }

                }
            }
        }
        System.out.printf("%d - folder counts\n",folderCount);
    }
}
