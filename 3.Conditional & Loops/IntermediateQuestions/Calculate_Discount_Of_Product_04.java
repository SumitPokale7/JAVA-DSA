package IntermediateQuestions;

public class Calculate_Discount_Of_Product_04 {
    public static void main(String[] args) {
        // DiscountRate = 25 --> 25%
        Discount(1000, 25);
    }

    static void Discount(int MRP, int DiscountRate) {

        int SalePrice, Amount;

        System.out.println("MRP: " + MRP);

        System.out.println("Discount Rate: " + DiscountRate);

        SalePrice = 100 - DiscountRate;

        Amount = (SalePrice * MRP) / 100;

        System.out.println("Amount After Discount: " + Amount);
    }
}
