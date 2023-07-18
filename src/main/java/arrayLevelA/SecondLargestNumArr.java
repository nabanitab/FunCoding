package arrayLevelA;

public class SecondLargestNumArr {
    public static void main(String[] args) {
        int[] userInput = {10,46,53,20,20,52,97,67};
        getSecondHighestElement(userInput);
    }
    private static void getSecondHighestElement(int[] userInput){
        int[] input = userInput;
        int fstHighestInput = input[0];
        int secHighestInput = input[0];

        for (int i = 0; i<input.length; i++){
            if(input[i]>fstHighestInput){
                secHighestInput=fstHighestInput;
                fstHighestInput=input[i];
            }
        }
        System.out.println(fstHighestInput);
        System.out.println(secHighestInput);
    }
}
