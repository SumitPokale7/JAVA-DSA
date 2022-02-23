package BeginnerQuestions;

//Q16. Volume Of Cylinder.

public class Volume_Of_Cylinder_16 {
    public static void main(String[] args) {

        Cylinder(5, 10);
    }

    static void Cylinder(int Radius, int Height) {
        float Cylinder = (float) (3.14 * Radius * Radius * Height);

        System.out.println("Volume Of Cylinder: " + Cylinder);
    }
}
