public class Factorial {
    private int number;
    public Factorial(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int calculFactorial(){
        int rezultat = 1;
     for(int i = 1; i <= number; i++){
         rezultat = rezultat * i;
     }
     return rezultat;
    }
}
