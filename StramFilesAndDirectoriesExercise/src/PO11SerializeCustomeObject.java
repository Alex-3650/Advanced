import java.io.*;

public class PO11SerializeCustomeObject {


    public static void main(String[] args)  {

        Course course=new Course("Java Advanced",220);



        try( FileOutputStream outputStream=new FileOutputStream("serialization-course-object");
             ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream)) {

                   objectOutputStream.writeObject(course);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       try( FileInputStream inputStream=new FileInputStream("C:\\Users\\georg\\SoftUniAdvanced\\serialization-course-object");
            ObjectInputStream objectInputStream=new ObjectInputStream(inputStream)) {
           Course course1= (Course) objectInputStream.readObject();



       } catch (ClassNotFoundException | IOException e) {
           throw new RuntimeException(e);
       }


    }
}
