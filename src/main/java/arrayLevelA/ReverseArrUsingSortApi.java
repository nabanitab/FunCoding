package arrayLevelA;

import java.util.Arrays;

public class ReverseArrUsingSortApi {
    public static void main(String[] args) {
        int[] arr = {8,33,0,2,43,5,9};
        getReverseArray(arr);
    }
    public static void getReverseArray(int[] arr){
        int[] input  = arr;

        System.out.println("element before sorting : ");
        System.out.println(Arrays.toString(arr));

        // Arrays.parallelSort(input);
       // Arrays.sort(arr);

        System.out.println("element after sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
