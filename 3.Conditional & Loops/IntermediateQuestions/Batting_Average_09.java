package IntermediateQuestions;

// Q9. Calculate Batting Average

public class Batting_Average_09 {
    public static void main(String[] args) {

        System.out.println(Batting(250, 10, 4));
    }

    static int Batting(int Runs, int Matches, int NOut) {

        int Out = Matches - NOut;

        if (Out == 0) {
            return -1;
        }
        int Avg = Runs / Out;

        return Avg;
    }
}
