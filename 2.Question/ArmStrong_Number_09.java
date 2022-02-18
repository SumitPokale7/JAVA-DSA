import java.util.Scanner;

// Q9. To find Armstrong Number between two given number.

public class ArmStrong_Number_09 {
    public static void main(String[] args) {

        ArmStrongNumber();
    }

    static void ArmStrongNumber() {

        int temp, Sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int A = input.nextInt();
        temp = A;

        while (A > 0) {
            int B = A % 10;
            Sum = Sum + (B * B * B);
            A = A / 10;
        }

        if (temp == Sum) {
            System.out.println("It is ArmStrong Number");
        } else {
            System.out.println("It is Not a ArmStrong Number");
        }
        input.close();
    }
}
