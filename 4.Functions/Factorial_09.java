
//  Q9. Write a Program to Print the Factorial of Number by Defining a Method Named 'Factorial'.

public class Factorial_09 {
    public static void main(String[] args) {

        System.out.println(Factorial(5));
    }

    static int Factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }
}
