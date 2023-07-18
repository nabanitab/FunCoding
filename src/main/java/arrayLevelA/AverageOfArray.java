package arrayLevelA;

//length of the array?
//sum of the array?
//average of the array?

public class AverageOfArray {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8};
        getAvrgArray(arr);
    }
    public static void getAvrgArray(int[]arr){
        int[] avg = arr;
        int sum = 0;
        int length = 0;
        double average = 0;

        for (int i = 0; i<arr.length; i++){
            sum = sum + avg [i];
        }
        System.out.println("sum ->"+sum);
        length = avg.length;
        System.out.println("length ->"+length);

        average = sum/length;
        System.out.println("Average ->"+average);
    }
}
