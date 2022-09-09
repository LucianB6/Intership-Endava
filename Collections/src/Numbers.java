import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        //exercise 2
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        List<Integer> integerList = new ArrayList<>();
        List<Integer> duplicates = new ArrayList<>();
        List<String> students = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            integerList.add(number);
            String name = scanner.nextLine();

            System.out.print("\n");
            for (int i = 0; i<integerList.toArray().length; i++){
                for (int k = i+1; k< integerList.toArray().length; k++){
                    if (integerList.get(i).equals(integerList.get(k))){
                        duplicates.add(integerList.get(i));
                        System.out.printf("Is a duplicate: " + duplicates + "\n");
                        int newnumber = rand.nextInt(100);
                        System.out.printf(integerList.get(i) + " is replaced with: " + newnumber + "\n");
                        integerList.remove(integerList.get(i));
                        integerList.add(newnumber);
                    }
                }
            }
            System.out.printf("List is: " + integerList + "\n");
            if(name.equals("exit")){
                break;
            }
        }
        scanner.close();
    }
}
