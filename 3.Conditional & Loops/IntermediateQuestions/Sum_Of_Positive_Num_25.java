package IntermediateQuestions;

// Q25. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

public class Sum_Of_Positive_Num_25 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -2, -3, -4 };
        List(arr);
    }

    static void List(int[] arr) {
        int PostiveEven = 0, PostiveOdd = 0, NegativeNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                PostiveEven++;
            } else if (arr[i] % 2 == 1 && arr[i] > 0) {
                PostiveOdd++;
            }
            if (arr[i] < 0) {
                NegativeNum++;
            }
        }
        System.out.println("Postive Even Numbers: " + PostiveEven);
        System.out.println("Postive Odd Numbers: " + PostiveOdd);
        System.out.println("Negative Numbers: " + NegativeNum);
    }
}
