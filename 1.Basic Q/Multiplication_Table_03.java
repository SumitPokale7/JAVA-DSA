// Q3. Take a Number as input and Print the Multiplication table for it. 

public class Multiplication_Table_03 {
    public static void main(String[] args) {
        MultiplicationTable(5);
    }

    static void MultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }
}
