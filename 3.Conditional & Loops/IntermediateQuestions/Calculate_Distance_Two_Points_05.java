package IntermediateQuestions;

// Q5. Calculate Distance Between Two Points

public class Calculate_Distance_Two_Points_05 {
    public static void main(String[] args) {

        Distance(25, 15, 35, 10);
    }

    static void Distance(int X1, int X2, int Y1, int Y2) {
        float Distance = (X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1);

        System.out.println("Distance between the said points: " + Math.sqrt(Distance));
    }
}
