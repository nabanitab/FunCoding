package CaOneQuestion;

/*
Ques 1. Write a program to check if a number is Happy number or not.
        (In number theory, a happy number is a number which eventually reaches 1 when replaced by the sum of the square
         of each digit. For instance, 13 is a happy number because { 1^{2}+3^{2}=10}, and 1^{2}+0^{2}=1})

*/

public class HappyNumber {
    public static void main(String[] args) {
        int number = 19;

        if (isHappyNumber(number)) {
            System.out.println(number + " is a Happy number.");
        } else {
            System.out.println(number + " is not a Happy number.");
        }
    }

    public static boolean isHappyNumber(int number) {
        int sum = 0;

        while (sum != 1 && sum != 4) {
            sum = calculateSquareSum(number);
            number = sum;
        }

        return sum == 1;
    }

    public static int calculateSquareSum(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        return sum;
    }
}

