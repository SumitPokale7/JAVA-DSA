package BeginnerQuestions;

// Q14. Volume Of Cone.

public class Volume_Of_Cone_14 {
    public static void main(String[] args) {

        Cone(5, 10);
    }

    static void Cone(int Radius, int Height) {
        float Cone = (float) (3.14 * Radius * Radius * Height / 3);

        System.out.println("Volume Of Cone: " + Cone);
    }
}
