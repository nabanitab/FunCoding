package CaOneQuestion;

public class ArmstrongNumberExample {


    public static void main(String[] args) {
        int number = 371;

        if (isArmstrongNumber(number)) {
            System.out.println(" is an Armstrong number : " + number );
        } else {
            System.out.println( " is not an Armstrong number : " + number );
        }
    }

    public static boolean isArmstrongNumber(int number) {
        //test
        int originalNumber = number;
        int sum = 0;
        int power = String.valueOf(number).length(); //This line calculates the number of digits in the input number.It converts the number to a string using

        while (number > 0) { //The loop continues as long as there are digits remaining in the number.
            int digit = number % 10;//This line extracts the last digit of the number by using the modulo operator % with 10.
            // This gives us the rightmost digit of the number.
            sum += Math.pow(digit, power);// Here, we raise the extracted digit to the power obtained earlier and add it to the sum
            number /= 10;// This line updates the number by removing the rightmost digit, effectively reducing the number of digits for the next iteration.
        }

        return sum == originalNumber;//compares the calculated sum with the original number. If they are equal, it means
        // the number is an Armstrong number, and true is returned. Otherwise, it is not an Armstrong number, and false is returned.
    }
}


