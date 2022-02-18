
// Q8. To find out whether the given String is Palindrome or not.

public class Palindrome_Number_08 {
    public static void main(String[] args) {

        System.out.println(PalinDrome("MaDaM"));
    }

    static boolean PalinDrome(String N) {
        N = N.toLowerCase();
        if (N == null || N.length() == 0) {
            return true;
        }
        for (int i = 0; i <= N.length() / 2; i++) {
            int S = N.charAt(i);
            int E = N.charAt(N.length() - 1 - i);
            if (S != E) {
                return false;
            }
        }
        return true;
    }
}
