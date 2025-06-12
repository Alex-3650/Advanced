import java.util.Arrays;
import java.util.function.Consumer;

public class SmartArray {

    private int[]data;
    private int index;


     public SmartArray(){
         this.data=new int[2];
         this.index=0;
     }

    public void add(int element){
        if(index==data.length){
          data=resize(data.length*2);
            }
       data[index]=element;
       index++;
    }


    public int get(int index){
         return this.data[index];
    }

    public boolean contain(int element){

        for (int i = 0; i < index; i++) {
            if (data[i]==element){
                return true;
            }

        }
        return false;
    }

    public int remove(int index){
         int element=data[index];
       //13 42 69 0
        //13 69 0 0

        for (int i = index; i <this.index-1 ; i++) {
            data[i]=data[i+1];

        }
        this.index--;
        data[this.index]=0;
        if (index==data.length/4){
            resize(data.length/2);
        }


        return element;
    }
    //55 44 22 11 22 33->
    // 55 44 22 22 11 22
    //2 12
    // 55 44 12 22 11 22 33
    public void add(int index,int element){
     int last=data[this.index-1];

        for (int i =this.index-1 ; i >index ; i--) {
            data[i]=data[i-1];
        }
        data[index]=element;
        add(last);



    }

      public int size(){

         return this.index;
      }
      public void foreach(Consumer<Integer> consumer){

          for (int i = 0; i < this.index; i++) {
              consumer.accept(data[i]);
          }


      }


    @Override
    public String toString() {
       StringBuilder toString=new StringBuilder("[");
        for (int i = 0; i < this.index-1; i++) {
            toString.append(data[i]).append(", ");
        }
        toString.append(data[this.index - 1]).append("]");

        return String.valueOf(toString);
    }

    private int[] resize(int newSize) {
         int[]newData=new int[newSize];

        System.arraycopy(data, 0, newData, 0, this.index);
        return newData;
    }
}
