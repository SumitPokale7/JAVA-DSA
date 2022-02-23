package IntermediateQuestions;

// Q10. Calculate CGPA.

public class Calculate_CGPA_10 {
    public static void main(String[] args) {

        System.out.println(CGPA(6, 300, 600));
    }

    static float CGPA(int TotalSubject, int TotalMarks, int TotalSubjectMarks) {

        int Percentage = TotalMarks / TotalSubject;

        float CGPA = (float) (Percentage / 9.5);

        return CGPA;
    }
}
