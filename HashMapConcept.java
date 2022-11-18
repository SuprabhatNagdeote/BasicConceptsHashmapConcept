import java.util.HashMap;

public class HashMapConcept {

    public static void main(String[] args){

        HashMap<Integer,String> hs = new HashMap<Integer,String>();
        hs.put(1,"Suprabhat");
        hs.put(2,"Diliprao");
        hs.put(3,"Nagdeote");
        hs.put(4,"WelcomeHome");

        System.out.println("The First value of Hashmap = " + hs.get(1));

        //hs.forEach((integer, s) -> System.out.println(hs));

        for(int i=1;i<=hs.size();i++){

            System.out.println(hs.get(i));
        }


    }
}
