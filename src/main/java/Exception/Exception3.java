package Exception;

public class Exception3 {

    public static void main(String[] args) {
        int row = 5;
        getStar(row);
    }
    private static void getStar(int row) {

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
