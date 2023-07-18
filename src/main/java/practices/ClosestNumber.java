package practices;

public class ClosestNumber {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 1, 6, -3, -6};   //initialize the arr
        int target = 0;      //initialize the target value
       int result= getClosestNumber(arr,target);
        System.out.println("The closest number of zero is : " + result);
    }

    public static int getClosestNumber(int[] arr, int target) {

        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = arr[i];
                return result;
            }
            if (arr[i] > 0 && result >= (arr[i] - target)) {
                result = arr[i];
            }
        }
        return result;
    }
}


