package IntermediateQuestions;

// Q18. Future Investment Value

public class Future_InvestmentValue_18 {
    public static void main(String[] args) {

        System.out.println(FutureInvestment(10000, 1, 10));
    }

    static double FutureInvestment(int investAmount, double MonthlyInterest, int Year) {
        double AccumulatedValue = investAmount * (Math.pow((1 + MonthlyInterest / 100), Year));

        return AccumulatedValue;
    }
}
