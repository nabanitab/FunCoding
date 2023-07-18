package arrayLevelA;

public class RemoveSpecificElementFromArr {
    public static void main(String[] args) {

        int[] userInput = {22, 98, 44, 33, 24, 19, 37};
        int removeEle = 33;
        RemoveSpecificElementFromArr.getRemoveEle(userInput,removeEle);
    }
    public static void getRemoveEle(int[] userInput, int removeEle){
        int[] input = userInput;
        int toRemove = removeEle;

        System.out.println("Before Removing the Element : ");
        for (int i = 0; i<input.length; i++){
            System.out.println(input[i] + " ");
        }

        for (int i = 0; i<input.length; i++){
            if(input[i]==toRemove){
                input[i] = input[i+1];
                input[i+1] = 0;

            }
        }
        System.out.println();

        System.out.println("AfterRemove the Element : " + removeEle);
        for (int i = 0; i<input.length; i++){
            System.out.println(input[i] + " ");
        }
    }
}

