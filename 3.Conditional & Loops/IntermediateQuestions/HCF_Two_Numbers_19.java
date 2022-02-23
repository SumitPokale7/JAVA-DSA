package IntermediateQuestions;

// Q19. HCF Of Two Numbers Program.

public class HCF_Two_Numbers_19 {
    public static void main(String[] args) {

        System.out.println(GCD(98, 56));
    }

    static int GCD(int a, int b) {

        if (b == 0) {
            return a;
        }

        return GCD(b, a % b);
    }

}
