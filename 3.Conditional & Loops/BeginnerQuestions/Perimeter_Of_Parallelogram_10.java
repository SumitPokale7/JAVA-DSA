package BeginnerQuestions;

// Q10. Perimeter Of Parallelogram.

public class Perimeter_Of_Parallelogram_10 {
    public static void main(String[] args) {

        Parallelogram(10, 5);
    }

    static void Parallelogram(int Base, int Side) {
        int Parallelogram = 2 * (Base + Side);

        System.out.println("Perimeter Of Parallelogram: " + Parallelogram);
    }
}