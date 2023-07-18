package CaOneQuestion;

 /*Write a program to delete an element from the array. Take the array and element to delete as input from the user.
        e.g. int[] arr = {1,2,3,4,5,6,7,8}
        int ele = 4
        o/p  int[] brr = {1,2,3,5,6,7,8}*/

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementDelete {
    public static void main(String[] args) {
        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array and populate it with user input
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to delete: ");
        int ele = scanner.nextInt();
        scanner.close();

        // Find the index of the element to delete
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                index = i;
                break;
            }
        }

        // Delete the element by shifting the elements to the left
        if (index != -1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Resize the array to remove the last element
            arr = Arrays.copyOf(arr, arr.length - 1);

            System.out.println("Element " + ele + " deleted successfully.");
            System.out.println("Updated array: " + Arrays.toString(arr));
        } else {
            System.out.println("Element " + ele + " not found in the array.");
        }
    }
}



