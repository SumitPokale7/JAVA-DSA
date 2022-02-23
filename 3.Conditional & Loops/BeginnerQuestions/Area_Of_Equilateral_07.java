package BeginnerQuestions;

// Q7. Area Of Equilateral Triangle.

public class Area_Of_Equilateral_07 {
    public static void main(String[] args) {

        Equilateral(10);
    }

    static void Equilateral(int A) {
        float Equilateral = (float) (Math.sqrt(3) / 4 * A * A);

        System.out.println("Area Of Equilateral: " + Equilateral);
    }
}