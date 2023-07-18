package Exception;

public class Exception2 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 20, 9, 64, 20};
        expT(arr);
    }

    public static void expT(int[] arr) {
        int[] userInput = arr;
        int sum = 0;
        try {
            for (int i = 0; i < userInput.length; i++) {
                sum = sum + userInput[i];
            }
        } catch (Exception ex) {
            System.out.println("tmi");
        }
        System.out.println("hgfhgdsfgsd");
    }
}

