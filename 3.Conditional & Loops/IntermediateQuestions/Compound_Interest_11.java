package IntermediateQuestions;

// Q11. Compound Interest.

public class Compound_Interest_11 {
    public static void main(String[] args) {

        System.out.println(Compound_Interest(10000, 0.05, 5));
    }

    static float Compound_Interest(int Principal, double Interest, int Years) {
        float CompoundInterset = (float) (Principal * Math.pow((1 + Interest), Years) - Principal);

        return CompoundInterset;
    }
}
