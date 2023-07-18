package arrayLevelA;

public class FindMaxMin {
    public static void main(String[] args) {
        int userInput[] = {2, 6, 4, 9, 5, 7, 1};
        getFindMaxNumber(userInput);
        getFindMinNumber(userInput);

    }
    public static void getFindMaxNumber(int[] userInput) {
        int[] input = userInput;
        int maxVal = input[0];

        for (int i = 0; i < input.length; i++) {

            if (input[i] > maxVal) {
                maxVal = input[i];
            }
        }
        System.out.println(maxVal);
    }

    public static void getFindMinNumber(int[] userInput) {
        int[] inputValue = userInput;
        int minVal = inputValue[0];

        for (int i = 0; i < inputValue.length; i++) {

            if (inputValue[i] < minVal) {
                minVal = inputValue[i];
            }
        }
        System.out.println(minVal);
    }
}
