
// Q3. A person is Eligible to vote if His/Her Age is Greater than or equal to 18.
// Define a method to find out if He/She is Eligible to Vote.

public class Vote_Eligible_03 {
    public static void main(String[] args) {

        Vote_Eligible(18);
    }

    static void Vote_Eligible(int Age) {
        if (Age > 18 || Age == 18) {
            System.out.println("Eligible for Vote");
        } else {
            System.out.println("Not-Eligible for Vote");
        }
    }
}
