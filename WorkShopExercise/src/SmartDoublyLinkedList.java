import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class SmartDoublyLinkedList {

    class Node{
        int element;
      Node next;
      Node prev;
      public Node(int element){
          this.element=element;
      }
    }
    private Node head;
    private Node tail;
    private int size;


    public void addFirst(int element){

        Node newNode=new Node(element);

        if (size==0){
            this.head=this.tail=newNode;
        }else{
            newNode.next=this.head;
            this.head.prev=newNode;
            this.head=newNode;

        }
        this.size++;
    }
    public void addLast(int element){

        Node newNode=new Node(element);
        if (size==0) {
            this.head = this.tail = newNode;
        }else{
            newNode.prev=this.tail;
            this.tail.next=newNode;
            this.tail=newNode;
        }
        this.size++;
    }

    public int get(int index){
       checkIndex(index);
       Node currentNode;
        if (index<size/2){
         currentNode=head;

            for (int i = 0; i < index; i++) {
                currentNode=currentNode.next;
            }
            return currentNode.element;

        }else {
            currentNode=tail;
            for (int i = size-1; i >index ; i--) {

                currentNode=currentNode.prev;

            }
            return currentNode.element;
        }

    }
    public int removeFirst(){
        if (isEmpty()){
            throw  new NoSuchElementException("The list is empty!");
        }
        int element=this.head.element;

            this.head=this.head.next;
            if (head==null){
                this.tail=null;
            }else{
                this.head.prev=null;

            }
        this.size--;
        return element;
    }
    public int removeLast(){
        if (isEmpty()){
            throw  new NoSuchElementException("The list is empty!");
        }
        int element=this.tail.element;
        this.tail=this.tail.prev;
        if (tail==null){
            this.head=null;
        }else{
            this.tail.next=null;
        }

        this.size--;
        return element;
    }

    public boolean isEmpty() {
       return size==0;
    }
    public void foreach(Consumer<Integer>consumer){
       Node currentNode=head;
       while (currentNode!=null){

           consumer.accept(currentNode.element);
           currentNode=currentNode.next;
       }

    }

    public int[] toArray(){
        AtomicInteger index= new AtomicInteger();
     int[]arr=new int[size];
        foreach(e->arr[index.getAndIncrement()]=e);
        return arr;
    }

    public int size(){
        return this.size;
    }
    public int getFirst(){

        return head.element;
    }
    public int getLast(){

        return tail.element;
    }





    private void checkIndex(int index){
        if (index<0 || index>=this.size){
            throw  new IndexOutOfBoundsException(String.format("Index %d is out of bounds for size %d",index,this.size));
        }

    }




}
