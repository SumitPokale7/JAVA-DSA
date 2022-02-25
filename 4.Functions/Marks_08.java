
// Q8. Write a Program that will Ask the user to Enter His\Her Marks (Out of 100).Define a Method that will Display Grades According to the Marks Entered.

public class Marks_08 {
    public static void main(String[] args) {

        System.out.println(Marks(39));
    }

    static String Marks(int Marks) {
        if (Marks > 91 && Marks < 100) {
            return "A+";
        } else if (Marks > 81 && Marks < 90) {
            return "A";
        } else if (Marks > 71 && Marks < 80) {
            return "B+";
        } else if (Marks > 61 && Marks < 70) {
            return "B";
        } else if (Marks > 51 && Marks < 60) {
            return "C";
        } else if (Marks > 41 && Marks < 50) {
            return "D";
        } else {
            return "FAIL";
        }
    }
}
