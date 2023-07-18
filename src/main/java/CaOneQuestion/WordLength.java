package CaOneQuestion;

/*Write a program to print each word length in a sentence.
        e.g. This is an example sentence.
        o/p	1  4
        2  2
        3  2
        4  7
        5  8*/

public class WordLength {
    public static void main(String[] args) {
        String sentence = "This is an example sentence.";

        // Split the sentence into words using space as the delimiter
        String[] words = sentence.split(" ");

        // Iterate over each word and print its length
        for (String word : words) {
            int length = word.length();
            System.out.println(length + " -> " + word);
        }
    }
}

