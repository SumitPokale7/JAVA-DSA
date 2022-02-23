package IntermediateQuestions;

public class ArmStrong_No_14 {
    public static void main(String[] Args) {

        System.out.println(ArmStrongNo(153));
    }

    static boolean ArmStrongNo(int a) {
        int temp, Sum = 0;
        temp = a;

        while (a > 0) {
            int b = a % 10;
            Sum = Sum + (b * b * b);
            a = a / 10;
        }

        if (temp == Sum) {
            return true;
        }
        return false;
    }
}
