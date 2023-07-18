package CaOneQuestion;

/*Write a program to count the number of vowels, consonant, digits, and special character in a sentence.
        e.g. This is a 235 example sentence $%^*
        o/p Vowels: 9
        Consonant: 13
        Digits: 3
        Special character: 4*/

public class CharecterCount {

    public static void main(String[] args) {
        String sentence = "This is a 235 example sentence $%^*";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialChars = 0;

        sentence = sentence.toLowerCase(); // Convert the sentence to lowercase for case-insensitive comparisons

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specialChars++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + specialChars);
    }
}


