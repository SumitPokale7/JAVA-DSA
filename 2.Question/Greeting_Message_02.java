import java.util.Scanner;

// Q2. Take name as input and print a greeting 
// message for that particular name.

public class Greeting_Message_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String a = input.next();

        Greeting(a);
        input.close();
    }

    static void Greeting(String n) {
        System.out.println("Hello " + n);
    }
}
