import java.lang.foreign.PaddingLayout;
import java.util.*;

public class PO7HandsOfCards {
    static Map<String,Integer>cards=Map.of("S",4,
            "H",3,
            "D",2,
            "C",1);

    static Map<String,Integer>powers= new HashMap<>( Map.of(
            "2",2,
            "3",3,
            "4",4,
            "5",5
            ,"6",6
            ,"7",7
            ,"8",8
            ,"9",9
            ,"10",10
            ,"J",11));


    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        powers.put("Q",12);
        powers.put("K",13);
        powers.put("A",14);
        Map<String ,HashSet<String> >players=new LinkedHashMap<>();


          String input=scanner.nextLine();

          while (!input.equals("JOKER")){

              String player=input.split(": ")[0];

              players.putIfAbsent(player,new HashSet<String>());

             String []cards=input.split(": ")[1].split(", ");

              for (String card : cards) {
                 players.get(player) .add(card);
              }
    //io.vavr

              input=scanner.nextLine();
          }


            players.forEach((k,v)->{

          int points=getPoints(v);
                System.out.printf("%s: %d\n",k,points);

            });
    }

    private static int getPoints(Set<String>set) {
    int points=0;
        for (String card : set) {
            String power=card.substring(0,card.length()-1);
            String type = String.valueOf(card.charAt(card.length()-1));
            points+=cards.get(type)*powers.get(power);
        }


    return points;

    }
}
