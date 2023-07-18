package CaOneQuestion;

public class CombinedArrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] brr = {6, 7, 8, 9, 10};

        int[] crr = combineArrays(arr, brr);

        // Print the combined array
        for (int num : crr) {
            System.out.print(num + " ");
        }
    }

    public static int[] combineArrays(int[] arr1, int[] arr2) {
        int[] combined = new int[arr1.length + arr2.length];
        int index = 0;
        int i = 0;

        while (i < arr1.length) {
            combined[index++] = arr1[i];
            combined[index++] = arr2[i];
            i++;
        }

        return combined;
    }
}


