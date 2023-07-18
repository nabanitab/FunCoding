package arrayLevelA;

public class IndexValue {
    public static void main(String[] args) {
        int indexValue[] = {1, 7, 8, 9, 3, 6, 3};
        getIndexValue(indexValue);

    }

    public static void getIndexValue(int[] indexValue) {
        int[] index = indexValue;
        int indexValueOf = 6;

        for (int i = 0; i < index.length; i++) {
            indexValueOf = indexValue[6];
        }
        System.out.println(indexValueOf);
    }
}
