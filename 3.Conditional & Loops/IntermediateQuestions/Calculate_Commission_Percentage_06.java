package IntermediateQuestions;

// Q6. Calculate Commission Percentage.

public class Calculate_Commission_Percentage_06 {
    public static void main(String[] args) {

        System.out.println(Commission(25000, 0.03));
    }

    static double Commission(int SalePrice, double CommissionPercentage) {
        return (double) SalePrice * CommissionPercentage;
    }
}
