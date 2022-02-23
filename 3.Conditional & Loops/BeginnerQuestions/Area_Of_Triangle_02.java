package BeginnerQuestions;

// Q2. Area Of Triangle.

public class Area_Of_Triangle_02 {
    public static void main(String[] args) {

        Triangle(6, 8);
    }

    static void Triangle(int Height, int Width) {

        float Triangle = (float) 0.5 * (Height * Width);

        System.out.println("Area Of Triangle: " + Triangle);
    }
}
