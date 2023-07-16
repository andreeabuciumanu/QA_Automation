package Andreea.OOPExercises;

import java.util.List;

public class PigLatin {

    public static void main(String[] args) {
        System.out.println(pigLatin("dfgtr"));
        
//        Sparta
//        arta -> +Sp
//        artaSpy + ay
//        artaSpay
    }

    private static boolean esteVocala(char c) {
        List<Character> vowels = List.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        if (vowels.contains(c)) {
            return true;
        }
        return false;
    }

    private static String pigLatin(String input) {
        String pigLatinResponse = "";
        int i;
        for (i = 0; i < input.length(); i++) {
            if (esteVocala(input.charAt(i))) {
                pigLatinResponse = input.substring(i);
                break;
            }

        }
        if (i == input.length()) {
            return "";
        }
        pigLatinResponse = pigLatinResponse + input.substring(0, i) + "ay";
        return pigLatinResponse;


    }

}
