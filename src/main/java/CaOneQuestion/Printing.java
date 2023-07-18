package CaOneQuestion;

// Write a program to print the following pattern.
//	1*2*3
//1*2*3
//1*2*3
//1*2*3
//1*2*3
public class Printing {

    public static void main(String[] args) {
        int rows = 5;
        int columns = 3;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(j + "*");
            }
            System.out.println();
        }
    }
}

