import java.util.Scanner;

// Q4. Write a Program to Print the Sum of Two Number Entered by user by Defining your Own Method

public class Sum_Of_Two_Num_04 {
    public static void main(String[] args) {

        SumOfTwoNum();
    }

    static void SumOfTwoNum() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int X = input.nextInt();
        System.out.println("Enter a Number:");
        int Y = input.nextInt();

        int Sum = X + Y;

        System.out.println("Sum Of Two Number: " + Sum);
        input.close();
    }
}
