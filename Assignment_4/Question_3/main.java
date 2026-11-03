public class main {

    static int findMaximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        int a = 14;
        int b = 9;

        System.out.println("Larger: " + findMaximum(a, b));
    }
}