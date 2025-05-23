import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Set<Integer>set=new TreeSet<>();
        set.add(4);
        set.add(4);
        set.add(6);
        System.out.println(set.toString());
    }
}