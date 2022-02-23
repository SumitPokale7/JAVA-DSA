package IntermediateQuestions;

// Q20. LCM Of Two Numbers

public class LCM_Two_Numbers_20 {
    public static void main(String[] args) {

        System.out.println(LCM(15, 20));
    }

    static int LCM(int a, int b) {
        return (a / GCD(a, b)) * b;
    }

    static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

}
