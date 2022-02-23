package IntermediateQuestions;

import java.util.Scanner;

// Q3. Calculate Average Of N Numbers

public class Calculate_Average_Of_N_03 {
    public static void main(String[] args) {

        Average();
    }

    static void Average() {

        Scanner input = new Scanner(System.in);

        int Count = 5;
        float[] arr = new float[Count];
        float Sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextFloat();
        }

        for (int i = 0; i < arr.length; i++) {
            Sum = Sum + arr[i];
        }

        float Averge = Sum / Count;

        System.out.println(Averge);

        input.close();
    }
}
