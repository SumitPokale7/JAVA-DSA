
// Q1. Define two Methods to Print the Maximum and the Minimum Number
// Respectively among three Numbers Entered by the User.

public class Largest_Num_01 {
    public static void main(String[] Args) {

        LargestNum(30, 25, 20);
    }

    static void LargestNum(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("A is Largest Number");
            }
        } else if (b > c) {
            System.out.println("B is Largest Number");
        } else {
            System.out.println("C is Largest Number");
        }
    }
}