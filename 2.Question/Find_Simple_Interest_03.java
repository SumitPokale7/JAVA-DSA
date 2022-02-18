
// Q3. Write a program to input principal, time, and rate
// (P, T, R) from the user and find Simple Interest

public class Find_Simple_Interest_03 {
    public static void main(String[] args) {

        // P = Principal Amount
        // R = Rate per Annum
        // T = Time(years)
        // Si = Simple interest

        Interest(34000, 30, 5);
    }

    static void Interest(double P, double R, int T) {
        double Si = (P * R * T) / 100;

        System.out.println("Simple interest: " + Si);
    }
}
