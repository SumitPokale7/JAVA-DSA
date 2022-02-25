
// Q6. Write a Program to print the Circumference and Area of Circle of Radius Entered by User.

public class Area_Of_Circle_06 {
    public static void main(String[] args) {

        System.out.println(AreaOfCircle(5));
    }

    static float AreaOfCircle(int R) {

        float a = (float) 3.14 * R * R;

        return a;
    }
}
