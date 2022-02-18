
// Q4. Take 2 Number as Inputs And Find their HCF And LCM. 

public class Find_HCM_LCM_04 {
    public static void main(String[] args) {
        Find_HCF_LCM(25, 35);
    }

    static void Find_HCF_LCM(int a, int b) {
        int temp, HCF, LCM;

        int x = a;
        int y = b;

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        HCF = a;
        LCM = (x * y) / HCF;

        System.out.println("HCF: " + HCF);
        System.out.println("LCM: " + LCM);
    }
}
