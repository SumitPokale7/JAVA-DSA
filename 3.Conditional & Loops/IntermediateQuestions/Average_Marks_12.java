package IntermediateQuestions;

// Q12. Calculate Average Marks.

public class Average_Marks_12 {
    public static void main(String[] args) {

        System.out.println(AverageMarks(47, 7));
    }

    static float AverageMarks(int TotalMarks, int TotalSubject) {

        float Average = TotalMarks / TotalSubject;

        return Average;
    }
}
