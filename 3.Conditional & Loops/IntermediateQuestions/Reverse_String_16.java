package IntermediateQuestions;

// Q16. Reverse A String.

public class Reverse_String_16 {
    public static void main(String[] args) {

        ReverseString("ABCD", "");
    }

    static void ReverseString(String Str, String NStr) {
        for (int i = 0; i < Str.length(); i++) {
            char ch = Str.charAt(i);
            NStr = ch + NStr;
        }
        System.out.println("Reverse String: " + NStr);
    }
}
