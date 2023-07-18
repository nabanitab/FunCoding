package practices;

import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name of the person : ");
        int age = scanner.nextInt();
        System.out.println("age of that person : " + age);
        scanner.close();
    }
}
