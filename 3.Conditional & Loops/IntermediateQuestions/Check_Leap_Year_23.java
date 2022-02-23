
// Q23. Check Leap Year or Not.

package IntermediateQuestions;

public class Check_Leap_Year_23 {
    public static void main(String[] Args) {

        System.out.println(LeapYear(2016));
    }

    static boolean LeapYear(int a) {
        if (a % 4 == 0) {
            return true;
        }
        return false;
    }
}