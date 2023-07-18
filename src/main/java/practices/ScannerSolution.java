package practices;

import java.util.Scanner;

public class ScannerSolution {

    public static void main(String[] args) {

        // creates an object of Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");

        // takes input from the keyboard
        String name = scanner.nextLine();

        // prints the name
        System.out.println("name is : " + name);

        // closes the scanner
        scanner.close();
    }
}

