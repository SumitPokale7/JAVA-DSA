package BeginnerQuestions;

import java.util.Scanner;

// Q24. Take integer inputs till the user enters 0 and print the sum of all numbers.

public class Sum_Of_All_Numbers_24 {
    public static void main(String[] args) {

        SumOfNumber();
    }

    static void SumOfNumber() {
        Scanner input = new Scanner(System.in);
        int Sum = 0;
        for (int i = 0; i < 1000; i++) {
            int X = input.nextInt();
            if (X == 0) {
                break;
            }
            Sum += X;
        }
        System.out.println(Sum);
        input.close();
    }
}
