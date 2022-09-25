public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
//        System.out.println(fibonacci(8));
//        System.out.println(fibonacci(9));
//        System.out.println(fibonacci(50));
    }

    public static int fibonacci(long n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n -1) + fibonacci(n - 2);
    }
}
