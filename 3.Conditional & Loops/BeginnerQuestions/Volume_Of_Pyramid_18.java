package BeginnerQuestions;

public class Volume_Of_Pyramid_18 {
    public static void main(String[] args) {

        pyramid(8, 3, 5);
    }

    static void pyramid(int length, int Width, int Height) {
        float pyramid = length * Width * Height / 3;

        System.out.println("Volume Of Pyramid: " + pyramid);
    }
}
