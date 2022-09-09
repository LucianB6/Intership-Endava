import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        //exercitiul 7
        List<Number> numbers = new ArrayList<>();

        Number number1 = new Number(21);
        Number number2 = new Number(11);
        Number number3 = new Number(41);
        Number number4 = new Number(31);
        Number number5 = new Number(61);

        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);

        System.out.println("List unsorted: \n" + numbers + "\n");


        //Cum sa folosesc comparatorul?
        Number[] newnumbers = {number1, number2, number3, number4, number5};
        System.out.print("Sorted list: \n");
        Arrays.sort(newnumbers);
        for (Number number:
             newnumbers) {
            System.out.println(number);
        }

    }

}
