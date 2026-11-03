public class main {
    public static void main(String[] args) {

        int n = 1024;
        int steps = 0;
        while (n > 1) {
            n = n / 2;
            steps++;
        }

        System.out.println("Halving steps: " + steps);
    }
}