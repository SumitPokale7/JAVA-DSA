package IntermediateQuestions;

// Q8. Calculate Depreciation of Value

public class Depreciation_Of_Value_08 {
    public static void main(String[] args) {

        System.out.println(Depreciation(7500, 4, 2));
    }

    static float Depreciation(int Principal, int RPA, int Years) {
        float Current;

        Current = (float) ((float) Principal * (Math.pow((1.0 - (((double) RPA) / 100)), Years)));

        float depreciation = Principal - Current;

        return depreciation;
    }
}
