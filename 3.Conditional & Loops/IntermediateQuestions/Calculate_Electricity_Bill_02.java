package IntermediateQuestions;

// Q2. Calculate the Electricity.

public class Calculate_Electricity_Bill_02 {
    public static void main(String[] args) {

        System.out.println(ElectricityBill(350));
    }

    static int ElectricityBill(int Unit) {

        if (Unit > 0 && Unit <= 100) {
            return Unit * 5;
        } else if (Unit > 100 && Unit <= 200) {
            return (100 * 5) + (Unit - 100) * 7;
        } else if (Unit > 200 && Unit <= 300) {

            return (100 * 5) + (100 * 7) + (Unit - 200) * 10;
        } else if (Unit > 300) {

            return (100 * 5) + (100 * 7) + (100 * 10) + (Unit - 300) * 15;
        }
        return -1;
    }
}
