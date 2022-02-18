
// Q5. Take 2 numbers as input and print the largest number.

public class Largest_Number_05 {
    public static void main(String[] args) {

        System.out.println(LargestNumber(5, 10));
    }

    static String LargestNumber(int a, int b) {
        if (a == b) {
            return "Both the Number is Same";
        } else if (a < b) {
            return "B is larger than A";
        }
        return "A is larger than B";
    }
}
