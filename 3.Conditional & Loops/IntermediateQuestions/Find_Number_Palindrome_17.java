
// Q17. Find if a number is palindrome or not

package IntermediateQuestions;

public class Find_Number_Palindrome_17 {
    public static void main(String[] Args) {

        System.out.println(Palin(122521));
    }

    // Palindrome
    static boolean Palin(int n) {
        return n == Count(n);
    }

    static int Count(int n) {
        int Digits = (int) (Math.log10(n)) + 1;
        return Remain(n, Digits);
    }

    static int Remain(int n, int Digits) {
        if (n % 10 == n) {
            return n;
        }
        int Remainder = n % 10;
        return Remainder * (int) (Math.pow(10, Digits - 1)) + Remain(n / 10, Digits - 1);
    }
}
