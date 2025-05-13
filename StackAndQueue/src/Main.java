import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* ArrayDeque<Integer> stack=new ArrayDeque<>();

        for (int i = 0; i < 4; i++) {
            stack.add(i);

        }

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.contains(3));
        System.out.println( stack.poll());
        System.out.println(Arrays.toString(stack.toArray()));
         */
           ArrayDeque <Integer>queue=new ArrayDeque<>();
        for (int i = 0; i < 4; i++) {
            queue.offer(i);
            queue.add(i);

        }
        System.out.println(Arrays.toString(queue.toArray()));
        queue.poll();
        queue.remove();
        System.out.println(Arrays.toString(queue.toArray()));



    }
}