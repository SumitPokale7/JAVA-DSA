package BeginnerQuestions;

// Q4. Area Of Isosceles Triangle

public class Area_Of_Isosceles_Triangle_04 {
    public static void main(String[] args) {

        Isoscles(5, 6);
    }

    static void Isoscles(int Height, int Width) {

        float Isosceles = (float) (Width * Math.sqrt(4 * (Height * Height) - (Width * Width))) / 4;

        System.out.println("Area Of Isosceles Triangle: " + Isosceles);
    }
}
