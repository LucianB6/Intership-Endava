//Write 4 methods where method1 calls method2, method2 calls method3 and method3 calls method4.
//Create a new checked exception and have method4 throw it.
//Method3 should not handle this exception (no try-catch block).
//Method2 should handle the exception and wrap it in a new exception (create a new exception).
//Method1 should have a try catch block and print the exception to the console (use printStackTrace() method) – we should see a “Caused by” message


import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    method1();
    }

    public static void method1(){
        try{
            System.out.printf("Am apelat metoda 1 cu succes \n");
            method2();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void method2(){
        List<Integer> varste = new ArrayList<>();
        varste.add(19);
        varste.add(18);
    try{
        System.out.printf("Am apelat metoda 2 cu succes\n");
        for (int lista: varste
             ) {
            if (lista < 18){
                throw new Exception("Minimul pentru acces este de 18 ani");
            }
        }
        method3();
    }catch (Exception e){
        e.printStackTrace();
    }
    }
    public static void method3(){
        System.out.printf("Am apelat metoda 3 cu succes \n");
        method4();
    }
    public static void method4(){
        System.out.printf("Am apelat metoda 4 cu succes");
    }

}
