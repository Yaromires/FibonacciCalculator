public class Fibonacci {

    public static void main(String[] args) {

        printFibonacciNumbers();
    }

    private static void printFibonacciNumbers() {
        for (int f : calculateFibonacciNumbers()) {
            System.out.println(f);
        }
    }

    private static int[] calculateFibonacciNumbers() {
        int[] fibonacci = new int[47];
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}