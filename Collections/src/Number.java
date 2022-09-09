public class Number implements Comparable<Number> {
    private int numbers;

    public Number(int numbers) {
        this.numbers = numbers;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    @Override
    public int compareTo(Number number) {
        return numbers - number.getNumbers();
    }
    @Override
    public String toString() {
        return "List{" +
                "number=" + numbers +
                '}';
    }
}
