package IntermediateQuestions;

public class Find_Ncr_Npr_15 {
    public static void main(String[] args) {

        System.out.println("NCR: " + NCR(5, 2));
        System.out.println("NPR: " + NPR(5, 2));
    }

    static int NCR(int n, int R) {
        int Result;
        Result = Factorial(n) / (Factorial(R) * Factorial(n - R));

        return Result;
    }

    static int NPR(int n, int R) {
        int Result;
        Result = Factorial(n) / Factorial(n - R);

        return Result;
    }

    static int Factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }
}
