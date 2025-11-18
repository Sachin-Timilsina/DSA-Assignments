public class GCDRecursion {
    // Recursive method to find GCD
    static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        int result = gcd(num1, num2);

        System.out.println("GCD: " + result);
    }

}
