
// Q2. Define a Program to Find Out whether a given Number is Even or Odd.

public class Even_Odd_02 {
    public static void main(String[] args) {

        EvenOdd(5);
    }

    static void EvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("It is Even Number");
        }
        System.out.println("It is Odd Number");
    }
}
