package BeginnerQuestions;

import java.util.Scanner;

// Q25. Take integer inputs till the user enters 0 and print the largest number from all.

public class Largest_Number_From_All_25 {
    public static void main(String[] args) {

        largest();
    }

    static void largest() {
        Scanner input = new Scanner(System.in);
        int Largest = 0;
        int i = 0;
        do {
            int X = input.nextInt();
            if (X == 0) {
                break;
            }
            if (X > Largest) {
                Largest = X;
            }
            i++;
        } while (i < 1000);
        System.out.println(Largest);
        input.close();
    }
}
