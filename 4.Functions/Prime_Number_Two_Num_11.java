
// Q11. Write a Function that Returns Between two Given Number.

public class Prime_Number_Two_Num_11 {
    public static void main(String[] args) {

        PrimeNoBtwTwoNumber(1, 10);
    }

    static void PrimeNoBtwTwoNumber(int Start, int End) {
        for (int i = Start; i <= End; i++) {
            int Flag;

            if (i == 1 || i == 0)
                continue;
            Flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    Flag = 0;
                    break;
                }
            }
            if (Flag == 1) {
                System.out.println(i);
            }
        }
    }
}
