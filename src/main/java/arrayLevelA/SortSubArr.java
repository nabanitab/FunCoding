package arrayLevelA;

import java.util.Arrays;
import java.util.Collections;

public class SortSubArr {
    public static void main(String[] args) {
        int[] arr = {6,7,5,4,3,8,7,10,1,2};
        getSortArr(arr);
    }
    public static void getSortArr(int[] arr){
        int[] sortSubArr = arr;
        int startIndex = 1;
        int endIndex = 7;

        System.out.println("Element before Sort : ");
        System.out.println(Arrays.toString(sortSubArr));

       Arrays.parallelSort(sortSubArr,1,7);
        // Arrays.sort(sortSubArr,2,8);

        System.out.println("Element after Sort : ");
        System.out.println(Arrays.toString(sortSubArr));

      /*  List<Integer>list = Arrays.asList(sortSubArr);
        Collections.sort(list);

        System.out.println("Element after Sort : ");
        System.out.println(Arrays.toString(sortSubArr))*/;
    }

}
