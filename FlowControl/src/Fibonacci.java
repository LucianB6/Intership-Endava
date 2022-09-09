public class Fibonacci {
    private int number;

    public Fibonacci(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int calculFibbonaci(){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        while(number > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            number--;
        }
        return n3;
    }
}

