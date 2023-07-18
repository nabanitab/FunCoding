package arrayLevelA;

public class CommonIntegerEle {
    public static void main(String[] args) {
        int[] userInput = {22, 44, 64, 26, 54, 34, 9, 47, 89, 56};
        int[] input     = {36, 78, 23, 12, 55, 9, 97, 34, 45, 78};
        CommonIntegerEle.getCommonElement(userInput, input);
    }

    private static void getCommonElement(int[] userInput, int[] input) {

        int[] fstInput = userInput;
        int[] secondInput = input;

        int length = (fstInput.length>secondInput.length)?fstInput.length:secondInput.length;
        int[] tempArray = new int[length];
        int k = 0;

        for (int i = 0; i < fstInput.length; i++) {
            for (int j = 0; j < secondInput.length;  i++) {

                if (fstInput[i] == secondInput[i]){
                    tempArray[k] = fstInput[i];
                    k++;
                }
            }
        }
        int[] outPut = new int [k];
        int m = 0;

        for (int i  = 0; i<=outPut.length; i++){
           outPut[i] = tempArray[m];
        }

        for (int j = 0; j<outPut.length; j++){
            System.out.println(outPut[j]);
        }

        for (int i  = 0; i<=outPut.length; i++){
            System.out.println(outPut[i]);
        }
        System.out.println("what is the value of k" + k);
        for (int i = 0; i<tempArray.length; i++){
            System.out.println(tempArray[i]);
        }
    }
}
