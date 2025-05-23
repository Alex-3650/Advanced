import java.util.*;

public class PO9PopulationCounter {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

      Map<String,Map<String,Long>>map=new LinkedHashMap<>();
      Map<String,Long> countryPopulation=new LinkedHashMap<>();

       String input=scanner.nextLine();

       while (!input.equals("report")){

           String[]elements=input.split("\\|");
           String city=elements[0];
           String country=elements[1];
           long population=Long.parseLong(elements[2]);

           map.putIfAbsent(country,new LinkedHashMap<>());
           countryPopulation.putIfAbsent(country, 0L);
           map.get(country).put(city,population);


           long populationToAdd=countryPopulation.get(country)+population;
           countryPopulation.put(country,populationToAdd);
           input=scanner.nextLine();
       }
        System.out.println();

       countryPopulation.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(entry -> {
           Map<String, Long> cities = map.get(entry.getKey());
           System.out.printf("%s (total population: %d)\n",entry.getKey(),entry.getValue());


           cities.entrySet().stream().sorted((entry1,entry2)-> entry2.getValue().compareTo(entry1.getValue())).forEach(innerMapEntry->
           System.out.printf("=>%s: %d\n",innerMapEntry.getKey(),innerMapEntry.getValue()));

       });




    }
}
