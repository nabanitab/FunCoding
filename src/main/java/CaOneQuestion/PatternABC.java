package CaOneQuestion;

public class PatternABC {
    public static void main(String[] args) {

        int n = 5; // Number of rows in the pattern

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print characters
            for (int k = 1; k <= i; k++) {
                System.out.print((char) (k + 64) + " ");
            }

            System.out.println(); // Move to the next line
        }
    }
}


