package BeginnerQuestions;

public class Perimeter_Of_Circle_08 {
    public static void main(String[] args) {

        PerimeterCircle(5);
    }

    static void PerimeterCircle(int R) {
        float Perimeter = (float) ((double) 2 * 3.14 * R);

        System.out.println("Perimeter Of Circle: " + Perimeter);
    }
}
