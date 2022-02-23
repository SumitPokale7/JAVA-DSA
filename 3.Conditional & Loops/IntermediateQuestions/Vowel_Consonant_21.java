package IntermediateQuestions;

// Q21. Vowel Or Consonant

public class Vowel_Consonant_21 {
    public static void main(String[] Args) {

        VowelConsonant("a");
    }

    static void VowelConsonant(String C) {

        if (C == "a" || C == "e" || C == "i" || C == "o" || C == "u") {
            System.out.printf("%S is a Vowel", C);
        } else {
            System.out.printf("%S is a Consonant", C);
        }
    }
}
