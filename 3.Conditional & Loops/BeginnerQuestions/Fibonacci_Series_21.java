package BeginnerQuestions;

// Q21. Fibonacci Series

public class Fibonacci_Series_21 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(Fibonacci(i));
        }
    }

    static int Fibonacci(int Num) {
        if (Num <= 0) {
            return 1;
        }

        return Fibonacci(Num - 1) + Fibonacci(Num - 2);
    }
}
