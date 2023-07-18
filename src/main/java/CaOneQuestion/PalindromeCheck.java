package CaOneQuestion;

/*write a program to check if a number is palindrome or not?*/
/*A palindrome number is a number that remains the same when its digits are reversed. In other words, it reads the same
 forward and backward.Here's an example:
Consider the number 12321.If we reverse its digits, we get 12321 again.Therefore, 12321 is a palindrome number.*/

public class PalindromeCheck {
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int number = 12321;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}

