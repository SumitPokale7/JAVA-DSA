import java.util.Scanner;

// Q1. Write a program to print whether a number 
// is even or odd, also take input from the user.

public class Even_Or_Odd_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int A = input.nextInt();
        System.out.println(EvenOrOdd(A));

        input.close();
    }

    static String EvenOrOdd(int n) {
        if (n % 2 == 0) {
            return "It is Even Number";
        }
        return "It is Odd Number";
    }
}