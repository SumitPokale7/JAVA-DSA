import java.util.Scanner;

// Q6. Input currency in rupees and output in USD.

public class Rupess_To_USD_06 {
    public static void main(String[] args) {

        CurrencyConversion();
    }

    static void CurrencyConversion() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Amount: ");
        float Rupees = input.nextFloat();
        float Dollar = Rupees / 74;
        System.out.println("Dollar: " + Dollar);
        input.close();
    }
}
