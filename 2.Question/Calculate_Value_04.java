import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

// Q4. Take in two numbers and an operator (+, -, *, /)
//  and calculate the value.

public class Calculate_Value_04 {
    public static void main(String[] args) {

        System.out.println(CalculateValue(5, 10));
    }

    static int CalculateValue(int a, int b) {
        Scanner input = new Scanner(System.in);
        char A = input.next().charAt(0);

        if (A == '+') {
            return a + b;
        } else if (A == '-') {
            return a - b;
        } else if (A == '*') {
            return a * b;
        }
        return a / b;
    }
}
