//Collectii:
//        Example 1: Generate 10 random numbers between 1 and 20, which require that the random numbers cannot be repeated
//        Example 2: Use Scanner to read a line of input from the keyboard, remove duplicate characters, and print out different characters // print result + duplicates
//        Example 3: Remove duplicate elements in the collection // given a list of student, remove duplicates
//
//        Example 4:Write a program to traverse(or iterate) HashSet
//        Example 5:Given an element write a program to check if element exists in ArrayList, HashSet (eg. class Stundent with name, grade and personalCode, given list of students check if the given student is present in the list)
//        Example 6: Write a program to iterate the HashMap
//        Example 7: Write a program to sort ArrayList using Comparable and Comparator

import java.io.FileNotFoundException;
import java.util.*;

public class Names {
    public static void main(String[] args) throws FileNotFoundException {

        //exercise 1 with random list

        Set<Integer> list = new HashSet<>();
        Random rand = new Random();
        int j = 0;
        for (int i = 0; i < 9; i++){
            j = rand.nextInt(20);
            list.add(j);
        }
        System.out.printf("The random list is: " + list + "\n");

        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        List<Integer> duplicates = new ArrayList<>();
        List<String> students = new ArrayList<>();

        //exercise 5
        List<Student> studentList = new ArrayList<Student>();
        Student student1 = new Student("Ionut");
        Student student2 = new Student("George");


        studentList.add(student1);
        studentList.add(student2);

        for (Student name:
                studentList) {
            System.out.printf("My class is: " + studentList + "\n");

        }


        //exercise 3

        while (scanner.hasNext()){
            String name = scanner.nextLine();

            students.add(name);
            for (int i = 0; i<students.size(); i++){
                for (int k = i+1; k< students.size(); k++){
                    if (students.get(i).equals(students.get(k))){
                        students.remove(students.get(i));
                    }
                }
            }
            if(name.equals("exit")){
                break;
            }
            System.out.printf("Students are: " + students + "\n");
        }
        scanner.close();
    }
}
