package BeginnerQuestions;

// Q22. Subtract the Product and Sum of Digits of an Integer

// 1281. Subtract the Product and Sum of Digits of an Integer
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class Subtract_Product_And_Sum_Of_Digits_22 {
    public static void main(String[] args) {

        System.out.println(Product_Sum(234));
    }

    static int Product_Sum(int n) {
        int product = 1, sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10;
        }
        return product - sum;
    }
}
