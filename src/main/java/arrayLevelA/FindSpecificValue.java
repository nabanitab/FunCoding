package arrayLevelA;

import java.util.Scanner;

public class FindSpecificValue {
    public static void main(String[] args) {
        int[] findValue = {1,8,4,6,3,7,0,3};
        int specificElement = 1;
        getSpecificValue(findValue,specificElement);

    }
    public static void getSpecificValue(int[]findValue,int specificElement){

        int[] specificValue = findValue;
        int Element = specificElement;

        for (int i = 0; i<specificValue.length; i++){
            System.out.println(" " + specificValue[i]);

            if (specificValue[i]==Element)
                System.out.println("Yes");
            }
        }
    }

