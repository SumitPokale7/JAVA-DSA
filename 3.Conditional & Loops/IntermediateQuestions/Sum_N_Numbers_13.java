package IntermediateQuestions;

import java.util.Scanner;

// Q13. Sum Of N Numbers.

public class Sum_N_Numbers_13 {
    public static void main(String[] args) {

        System.out.println(SumNumber(5));
    }

    static int SumNumber(int n) {
        Scanner input = new Scanner(System.in);
        int Count = 0;
        for (int i = 0; i < n; i++) {
            int X = input.nextInt();
            Count += X;
        }
        input.close();
        return Count;

    }
}
