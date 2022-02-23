package BeginnerQuestions;

// Q23. Input a number and print all the factors of that number.

public class Factors_Of_Number_23 {
    public static void main(String[] args) {

        Factors(60);
    }

    static void Factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " -> ");
            }
        }
        System.out.println("END");
    }
}
