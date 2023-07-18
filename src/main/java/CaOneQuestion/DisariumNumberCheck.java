package CaOneQuestion;

/*
 Write a program to check if a number is Disarium or not.
(A number is said to be the Disarium number when the sum of its digit raised to the power of their respective positions
 is equal to the number itself. Some of the other examples of Disarium number are 89, 135, 518)

 example to understand this concept in detail. Consider the number 135.

Separate the digits of the number: 1, 3, and 5.
Raise each digit to the power of its respective position: 1^1, 3^2, and 5^3.
Calculate the sum of the powers: 1 + 9 + 125 = 135.
Compare the sum with the original number. If they are equal, the number is a Disarium number.*/

public class DisariumNumberCheck {

    public static void main(String[] args) {
        int number = 135;

        if (isDisariumNumber(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
    }

    public static boolean isDisariumNumber(int number) {
        String strNumber = String.valueOf(number);
        int length = strNumber.length();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(strNumber.charAt(i));
            sum += Math.pow(digit, i + 1);
        }

        return sum == number;
    }
}

