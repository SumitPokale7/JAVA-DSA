
// Q7. Define a Method to find out if a Number is Prime or Not.

public class Prime_Num_07 {
    public static void main(String[] args) {

        System.out.println(PrimeNum(4));
    }

    static boolean PrimeNum(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
