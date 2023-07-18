package arrayLevelA;


public class MissingElement {

    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int length = 10;
        int outpt = MissingElement.getMissingEle(myArray, length);
        System.out.println("missing number is -> "+ outpt);
    }

    public static int getMissingEle(int[] myArray, int length) {
        int[] inputArray = myArray;
        int inputLength = length;
        int sum = 0;
        int actualSum = 0;
        int missingNumber = 0;

        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i];
        }
        actualSum = (inputLength*(inputLength+1))/2;
        missingNumber = actualSum - sum;
        return missingNumber;
    }
}
