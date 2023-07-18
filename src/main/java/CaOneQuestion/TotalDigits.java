package CaOneQuestion;

/*Write a program to count the total number of digits in the array.
        e.g. int[] arr = {2, 7, 234, 24, 9262, 67, 975}*/

public class TotalDigits {

    public static void main(String[] args) {
        int[] arr = {2, 7, 234, 24, 9262, 67, 975};

        int totalDigits = countTotalDigits(arr);

        System.out.println("Total number of digits: " + totalDigits);
    }

    public static int countTotalDigits(int[] arr) {
        int totalDigits = 0;

        for (int num : arr) {
            totalDigits += countDigits(num);
        }

        return totalDigits;
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}


