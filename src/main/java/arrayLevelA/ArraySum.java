package arrayLevelA;

public class ArraySum {

    public static void main(String[]args){

        int [] arr = {12,75,45,99,34};
        getSummetion(arr);

    }

    public static void getSummetion(int[]arr){
        int[] userInput = arr;
        int sum = 0;
        for (int i = 0; i<userInput.length;i++){

            sum = sum+userInput[i];

        }
        System.out.println("sum of the numbers are : " + sum);
    }
    }






















/*    public static void main(String[] args) {
          int[] input = {3,4,5,8,5,9,3};
          getArraySum(input);
    }
        public static void getArraySum (int[] input) {
            int[] user = input;
            int sum = 0;
            for (int i = 0; i < input.length; i++) {
                sum = sum + input[i];
            }
            System.out.println(sum);

        }*/
