package arrayLevelA;

public class SortNumericArr {
    public static void main(String[] args) {
        int arr[] = {3, 4, 9, 2, 1, 0, 5};
        int[] sortedArray = getSortedNum(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]+" ");
        }
    }

    public static int[] getSortedNum(int[] arr) {
        int[] userInput = arr;
        int temp;

        for (int i = 0; i < userInput.length; i++) {

            System.out.println(userInput[i]);

            for (int j = i + 1; j < userInput.length; j++) {
                if (userInput[j] < userInput[i]) {
                    temp = userInput[i];
                    userInput[i] = userInput[j];
                    userInput[j] = temp;
                }
            }
        }
        return userInput;
    }
}
