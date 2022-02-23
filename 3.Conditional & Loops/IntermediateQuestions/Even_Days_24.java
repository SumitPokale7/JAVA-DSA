package IntermediateQuestions;

// Q24. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

public class Even_Days_24 {
    public static void main(String[] args) {

        System.out.println(EvenDays(31));
    }

    static int EvenDays(int Month) {
        int Count = 0;
        for (int i = 1; i < Month; i++) {
            if (i % 2 == 0) {
                Count++;
            }
        }
        return Count;
    }
}
