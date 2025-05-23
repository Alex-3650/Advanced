import java.util.*;

public class PO4ProductShop {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String line=scanner.nextLine();

        TreeMap<String, LinkedHashMap<String ,Double>>data=new TreeMap<>();


         while (!line.equals("Revision")){

             String[]tokens=scanner.nextLine().split(", ");
              String shop=tokens[0];
              String product=tokens[1];
              double price=Double.parseDouble(tokens[2]);

             data.putIfAbsent(shop,new LinkedHashMap<>());
             LinkedHashMap <String,Double> innerData= data.get(shop);
              innerData.putIfAbsent(product,price);

             line=scanner.nextLine();
         }
        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : data.entrySet()) {
            System.out.println(entry.getKey()+"->");
               LinkedHashMap<String,Double>innerData=entry.getValue();
            for (var product:innerData.entrySet()){
                System.out.printf("Product: %s, Price: %.2f%n",product.getKey(),product.getValue());

            }



         }
    }
}
