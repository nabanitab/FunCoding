package arrayLevelA;

import java.util.Arrays;

public class NewArrToOldArr {
    public static void main(String[] args) {
        int[] userInput = {23, 45,12,56,88,22,94};
        NewArrToOldArr.getNewArrToOldArr(userInput);
    }

    private static void getNewArrToOldArr(int[] userInput ) {
        int[] input = userInput;
        int[] newArr = new int[input.length];

        System.out.println("old array");
        System.out.println(Arrays.toString(input));

        for (int i = 0; i<input.length; i++){
             newArr[i]=input[i];
        }

        System.out.println("new array");
        System.out.println(Arrays.toString(newArr));
    }
}
