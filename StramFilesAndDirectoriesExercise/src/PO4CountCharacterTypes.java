import javax.xml.stream.events.Characters;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

public class PO4CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\georg\\SoftUniAdvanced\\StramFilesAndDirectoriesExercise\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader= Files.newBufferedReader(Paths.get(path));
        BufferedWriter writer=new BufferedWriter(new FileWriter("count.txt"));
        Set<Character>vowels=Set.of('a','e','o','u','i');
        Set<Character> punt=Set.of('!','?',',','.');
        long vow=0;
        long pun=0;
        long other=0;



        String line=reader.readLine();
        while (line!=null){

            for (char c : line.toCharArray()) {
                if (vowels.contains(c)){
                    vow++;
                }
                else if (punt.contains(c)){
                    pun++;
                }else{
                    if (c==' '){
                        continue;
                    }
                    other++;
                }
            }

            line=reader.readLine();
        }
        writer.write("Vowels: "+  vow);
        writer.write("\nOther symbols: "+  other);
        writer.write("\nPunctuation: "+  pun);
        writer.flush();

    }
}
