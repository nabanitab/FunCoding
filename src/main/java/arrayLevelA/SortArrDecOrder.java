package arrayLevelA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrDecOrder {
    public static void main(String[] args) {
        System.out.println("using sort in descending order");
        int[] userInput = {73,63,28,45,10,35,23};
        getSortDescending(userInput);
    }
    public static void getSortDescending(int[] userInput){

        for (int i = 0; i < userInput.length; i++) {
            System.out.print(userInput[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");

        for (int i = userInput.length-1; i >= 0; i--) {
            System.out.print(userInput[i] + " ");
        }
    }
}
        /*System.out.println("Element before sorting : ");
        System.out.println(Arrays.toString(input));

        List<Integer>list=Arrays.asList(input);
        Collections.sort(list,Collections.reverseOrder());

        System.out.println("Element after sorting : ");
        System.out.println(Arrays.toString(input));*/


