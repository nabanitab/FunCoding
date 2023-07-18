package arrayLevelA;

public class InsertNumSpecificPosition {
    public static void main(String[] args) {

        int length = 8;
        int index = 6;
        int element = 10;
        getNumFromSpecificPosition(length, index, element);
    }

    public static void getNumFromSpecificPosition(int length, int index, int element) {
        //  int inputArray[] = insertNum;
        int input_Length = length;
        int input_index = index;
        int input_element = element;

        int[] userArray = new int[input_Length];

        for (int i = 0; i < userArray.length; i++) {
            if (i == input_index) {
                userArray[i] = input_element;
            }
        }
        for (int i = 0; i < userArray.length; i++) {
            System.out.println(userArray[i]);
        }
    }
}
