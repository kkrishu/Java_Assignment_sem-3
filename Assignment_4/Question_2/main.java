public class main {

    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {

        int n = 5;
        int r = 2;

        System.out.println("5P2 = " + permutation(n, r));
    }
}