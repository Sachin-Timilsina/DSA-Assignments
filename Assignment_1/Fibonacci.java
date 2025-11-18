public class Fibonacci {
    public int Fib(int term) {
        return switch (term) {
            case 0 -> 0;
            case 1 -> 1;
            default -> Fib(term-1) + Fib(term-2);
        };
    }

    public static void main(String[] args) {
        int term = 10;
        Fibonacci fib = new Fibonacci();
        for (int i = 0; i < term; i++) {
            System.out.println(fib.Fib(i));
        }
    }
}
