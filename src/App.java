import java.util.ArrayList;
import java.util.Scanner;

public class App {
    /*
     * Write a program that counts the number of vowels and consonants in a
     * given string. Do this for the English language, which has five vowels
     * (a, e, i, o, and u).
     */
    public static int countVowels(String s) {
        int vowels = 0;
        ArrayList<Character> list = new ArrayList<Character>();
        char vowel[] = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ')) {
                list.add(s.charAt(i));
            }
        }
        for (int j = 0; j < list.size(); j++) {
            for (int k = 0; k < vowel.length; k++) {
                if (list.get(j) == vowel[k]) {
                    vowels++;
                }
            }
        }

        return vowels;
    }

    public static int countConsonants(String s) {
        int consonants = 0;
        ArrayList<Character> list = new ArrayList<Character>();
        char consonant[] = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q',
                'r', 's', 't', 'v', 'w', 'x', 'y', 'z' };

        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ')) {
                list.add(s.charAt(i));
            }
        }
        for (int j = 0; j < list.size(); j++) {
            for (int k = 0; k < consonant.length; k++) {
                if (list.get(j) == consonant[k]) {
                    consonants++;
                }
            }
        }

        return consonants;
    }

    public static void main(String[] args) throws Exception {
        String s;
        int vowelsCount = 0;
        int consonantCount = 0;
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Enter the string: ");
            s = scnr.nextLine();
        }
        vowelsCount = countVowels(s);
        consonantCount = countConsonants(s);
        System.out.println(s + " has " + vowelsCount + " vowels and " + consonantCount + " consonants");
    }
}
