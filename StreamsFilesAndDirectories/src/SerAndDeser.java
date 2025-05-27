import java.io.*;

public class SerAndDeser {

    static class Cube   implements Serializable {
       private String color;
        private double width;
       private  double height;
       private double depth;

        public Cube(String color, double depth, double height, double width) {
            this.color = color;
            this.depth = depth;
            this.height = height;
            this.width = width;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cube cube=new Cube("Black",13,42,73);
        //Serialization
        FileOutputStream fileOutputStream= new FileOutputStream("object-cube-data");


        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cube);
        objectOutputStream.close();

        //////////////////////////////////////////////////
        //Deserialization
        FileInputStream fileInputStream=new FileInputStream("object-cube-data");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
       Cube cube2 = (Cube)objectInputStream.readObject();

        System.out.println(cube2.color);
        System.out.println(cube2.height);
        System.out.println(cube2.depth);
        System.out.println(cube2.width);


    }
}
