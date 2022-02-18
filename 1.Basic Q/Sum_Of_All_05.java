import java.util.Scanner;

// Q5. Keep Taking Number as Input till the User Enters 'X',
//  After that Print Sum of All.

public class Sum_Of_All_05 {
    public static void main(String[] args) {

        SumOfAll();
    }

    static void SumOfAll() {
        Scanner input = new Scanner(System.in);

        int temp = 0;
        int n = 0;
        System.out.println("Enter a Numbers, if you Want to Exit Press 0");
        while (n < 1000) {
            int A = input.nextInt();
            if (A == 0) {
                break;
            }
            temp += A;
        }
        System.out.println(temp);
        input.close();
    }
}
