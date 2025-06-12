import java.util.Collection;
import java.util.function.Consumer;

public class SmartStack {
    private Node top;
    private int size;

    private static class Node {
        private int val;
        private Node prev;

        public Node(int value,Node prev) {
          this.val=value;
          this.prev=prev;
        }
    }



    public void push(int element){
        top= new Node(element,top);
        size++;
    }
    public int peek(){

        return top.val;
    }
    public int pop(){

        int val=peek();
        top=top.prev;
        size--;

         return val;
    }
    public int size(){
        return this.size;
    }
    public void foreach(Consumer<Integer>consumer){
        Node last=top;

        while (last!=null){

            consumer.accept(last.val);
            last=last.prev;

        }
    }
    public String toString(){

        Node last=top;
        StringBuilder text=new StringBuilder();
        text.append("[");
        while (last!=null){

            text.append(last.val).append(", ");
            last=last.prev;
        }
        int index=text.lastIndexOf(",");
        text.replace(index,index+1,"]");
        return String.valueOf(text);


    }
}
