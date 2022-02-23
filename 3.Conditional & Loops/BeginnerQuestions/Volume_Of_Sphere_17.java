package BeginnerQuestions;

public class Volume_Of_Sphere_17 {
    public static void main(String[] args) {

        Sphere(5);
    }

    static void Sphere(int Radius) {
        float Sphere = (float) ((4 / 3) * 3.14 * Radius * Radius * Radius);

        System.out.println("Volume Of Sphere: " + Sphere);
    }
}
