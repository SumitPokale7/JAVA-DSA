// Q1. Input a year And Find Whether it is Leap Year or Not. 

public class Leap_Year_Or_Not_01 {
    public static void main(String[] args) {

        System.out.println(LeapYear(2016));
    }

    static String LeapYear(int n) {
        if (n % 4 == 0) {
            return "This is Leap Year";
        }
        return "This is not Leap Year";
    }

}