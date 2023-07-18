
package HakerRank;

import java.util.Scanner;

public class Solutions {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        System.out.println("number : ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N%2 == 0 ||N<2 ){
            System.out.println("Not Weird");

            if (N%2 == 0 ||N<2){
                System.out.println("Not Weird");

                if (N%2 == 0 ||N<20){
                    System.out.println("Not Weird");
                }else{
                    System.out.println("Weird");

                }

                scanner.close();
            }
        }
    }
}

