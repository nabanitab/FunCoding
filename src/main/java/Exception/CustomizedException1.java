package Exception;

public class CustomizedException1 {

    public static void main(String[] args) {
        System.out.println("nabanita");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println(100 / 20);
        }
        System.out.println("solve");
    }
}
