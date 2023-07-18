package practices;

public class Test2 {
    public static void main(String[] args) {
        int i;
        int j = 10;
        for (i = 0; i < 10; i++) {
            System.out.println("*");
            for (j = 0; j <= i; j++) {
                System.out.println("-");

            }
        }
        System.out.println();
    }
}
