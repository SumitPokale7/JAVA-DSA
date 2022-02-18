
// Q7. To calculate Fibonacci Series up to n numbers.

public class Fibonacci_Number_07 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(FibNo(i));
        }
    }

    static int FibNo(int n) {
        if (n <= 1) {
            return 1;
        }
        return FibNo(n - 1) + FibNo(n - 2);
    }
}
