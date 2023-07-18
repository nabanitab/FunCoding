package CaOneQuestion;

//Write a program to print the following pattern.

//	A B C D E
//	F G H I  J
//	K L M N O
//	P Q R S T
//	U V W X Y

public class StringPattern {

    public static void main(String[] args) {
        int rows = 5;
        int count = 65; // ASCII value of 'A'

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print((char) count + " ");
                count++;
            }
            System.out.println();
        }
    }
}


