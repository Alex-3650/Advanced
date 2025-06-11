package PO4;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PO4Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String   line2=scanner.nextLine();

        Map<String, Cat> catMap=new LinkedHashMap<>();
         while (!line2.equals("End")){
           String []line=line2.split("\\s+");
           String catType=line[0];
           String catName=line[1];
           double catFeature=Double.parseDouble(line[2]);
              Cat cat=null;
             switch (catType){

                 case"Siamese"->{
                     cat=new Siamese(catName,catType,catFeature);
                 }
                 case"Cymric"->{
                     cat=new Cymric(catName,catType,catFeature);
                 }default -> cat=new StreetExtraordinaire(catName,catType,catFeature);
             }
             catMap.put(catName,cat);

             line2=scanner.nextLine();
         }
        System.out.println(catMap.get(scanner.nextLine()));
    }
}
