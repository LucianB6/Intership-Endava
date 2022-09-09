import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Traverse {
    public static void main(String[] args) {
        //exercise 4
        HashSet<Integer> traverse = new HashSet<>();

        traverse.add(21);
        traverse.add(31);
        traverse.add(12);

        Iterator<Integer> it = traverse.iterator();
        System.out.print("Iterated list is: \n");

        while (it.hasNext()){
            System.out.printf(it.next() + " ");
        }
        System.out.printf("\n");

        Map<Integer, String> map = new HashMap<>();

        map.put(0,"Ionut");
        map.put(1,"George");
        map.put(2,"Cristi");

        System.out.printf("The HashMap is: " + map + "\n");

        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()){

            Map.Entry mapElement = (Map.Entry)iterator.next();

            String studentId = ((String) mapElement.getValue() + "B4");
            System.out.printf(mapElement.getKey() + " : " + studentId + "\n");
        }
    }
}
