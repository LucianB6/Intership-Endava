import java.nio.channels.Pipe;

public class Main {
    static Factorial factorial = new Factorial(4);
    static Palindrom palindrom = new Palindrom("maam");
    static PrimeNumber primeNumber = new PrimeNumber(117);
    static Fibonacci fibonacci = new Fibonacci(6);

    public static void main(String[] args) {
        Main main = new Main();

        System.out.print("Factorialul este: \n");
        main.factorialCalcul();

        System.out.print("Fibonacci este: \n");
        main.fibonacciCalcul();

        System.out.print("Verificare palindrom: \n");
        main.verificarePalindrom();

        System.out.print("Verificare primalitate: \n");
        main.primeNumber();

    }

    public void verificarePalindrom() {
        if (palindrom.verificarePalindrom()) {
            System.out.print("Este palindrom \n");
        } else System.out.print("Nu este \n");

    }

    public void primeNumber() {

        if (primeNumber.verificarePrimaritate()) {
            System.out.printf(primeNumber.getNumber() + " este numar prim");
        } else System.out.print(primeNumber.getNumber() + " nu este numar prim");
    }

    public void fibonacciCalcul() {
        System.out.printf("Fibonacci pentru " + fibonacci.getNumber() + " este: " + fibonacci.calculFibbonaci());
        System.out.print("\n");
    }
    public void factorialCalcul(){
        System.out.printf("Factorialul pentru numarul oferit este: " + factorial.calculFactorial());
        System.out.print("\n");
    }
}