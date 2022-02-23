package BeginnerQuestions;

// Q19. Curved Surface Area Of Cylinder.

public class Curved_Area_Of_Cylinder_19 {
    public static void main(String[] args) {

        Cylinder(5, 10);
    }

    static void Cylinder(int Radius, int Height) {
        float Cylinder = (float) (2 * 3.14 * Radius * Height);

        System.out.println("Curved Surface Area Of Cylinder: " + Cylinder);
    }
}
