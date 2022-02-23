
// Q1. Factorial Program.

package IntermediateQuestions;

public class Factorial_01 {
    public static void main(String[] args) {

        System.out.println(FactorialNo(5));
    }

    static int FactorialNo(int a) {
        if (a <= 1) {
            return 1;
        }
        return a * FactorialNo(a - 1);
    }
}
