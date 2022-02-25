
// Q12. Write a Function that returns the Sum Of First n Natural Number.

public class Natural_Num_12 {
    public static void main(String[] args) {

        NaturalNum(10);
    }

    static void NaturalNum(int n) {
        int Sum = 0;
        for (int i = 0; i <= n; i++) {
            Sum += i;
        }
        System.out.println(Sum);
    }
}
