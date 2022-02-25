
// Q10. Write a function to Find if a number is a Palindrome or Not.

public class Palindrome_10 {
    public static void main(String[] args) {

        System.out.println(Palin(454));
    }

    static boolean Palin(int n) {
        int Rem, temp, Sum = 0;

        temp = n;

        while (n > 0) {
            Rem = n % 10;
            Sum = (Sum * 10) + Rem;
            n = n / 10;
        }
        if (temp == Sum) {
            return true;
        }
        return false;
    }
}
