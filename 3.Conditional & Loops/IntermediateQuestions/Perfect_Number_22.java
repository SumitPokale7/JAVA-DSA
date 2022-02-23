package IntermediateQuestions;

// Q22. Perfect Number

public class Perfect_Number_22 {
    public static void main(String[] args) {

        Perfect(28);
    }

    static void Perfect(int n) {
        int Sum = 0, i = 1;

        while (i <= n / 2) {
            if (n % i == 0) {
                Sum += i;
            }
            i++;
        }
        if (Sum == n) {
            System.out.println("It is Perfect Number");
        } else {
            System.out.println("It is Not Perfect Number");
        }
    }
}
